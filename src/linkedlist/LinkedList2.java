package linkedlist;

import javax.naming.directory.SearchControls;

public class LinkedList2 {
    public static void main(String[] args) {
        // 2 Node 와 Node 연결하기 : Node 인스턴스간 연결
        // 2개의 노드 만들기
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        node1.next = node2;
        Node head = node1; //맨앞에 있는 노드 선언 <헤드>

        SingleLinkedList<Integer>MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.PrintAll();

        System.out.println("---------------------");
        MyLinkedList.addNodeInside(10,1);
        MyLinkedList.PrintAll();
        MyLinkedList.deNode(3);
        MyLinkedList.deNode(1);
        MyLinkedList.deNode(5);
        System.out.println("---------------------");
        MyLinkedList.PrintAll();
    }

    // 1. Node 클래스 구현
    public static class Node<T> {
        T data; // 데이터
        Node<T> next = null; //다음 객체를 가리키는 포인터

        public Node(T data) {
            this.data = data; // 생성자는 데이터 값을 받아서 데이터값을 저장하면 된다.
        }
    }

    //링크드 리스트에 데이터 추가하기
    public static class SingleLinkedList<T>{
        public Node<T> head = null; //헤드를 선언 아직은 빈 값

        public class Node<T>{
            T data; //데이터값
            Node<T> next = null; //포인터값


            public Node(T data){
                this.data = data;
            }
        }

        //노드를 추가 할때 필요한 메서드
        public void addNode(T data){
            if(head == null) { // 헤드가 비었으면 노드값을 넣어준다.
                head = new Node<T>(data);
            }
            else{ //노드의 넥스트가 널이 아니면 노드를 다음의 넥스트로 바꾸어라 null이면 마지막 노드이구나!
                Node<T> node = this.head;
                while (node.next!= null){
                    node = node.next;
                }
                node.next = new Node<T>(data);
                //while문이 끝나면 마지막 노드는 null값일 것이고 그 마지막 노드의 포인터를 Node 값으로 연결을 시켜준다.
            }
        }
        public void PrintAll(){
            if(head != null){
                Node<T> node = this.head;
                System.out.println(node.data);
                while(node.next != null){
                    node = node.next;
                    System.out.println(node.data);
                }
            }
        }

        public Node<T> search(T data){
            if(this.head == null){
                return null;
            }
            else{
                Node<T> node = this.head;
                while(node != null){
                    if(node.data == data){
                        return node;
                    }
                    else{
                        node = node.next;
                    }
                }
                return null;
            }
        }
        public void addNodeInside(T data, T isData){
            Node<T>searchedNode = this.search(isData);

            if(searchedNode == null){
                this.addNode(data);
            }
            else{
                Node<T> nextNode = searchedNode.next;
                searchedNode.next = new Node<T>(data);
                searchedNode.next.next = nextNode;
            }

        }
        public boolean deNode(T isData){
            if(this.head == null){
                return false;
            }
            else{
                Node<T> node = this.head;
                if(node.data == isData){
                    this.head = this.head.next;
                    return true;
                }else{
                    while(node.next != head){
                        if(node.next.data == isData){
                            node.next = node.next.next;
                            return true;
                        }
                        node = node.next;
                    }
                    return false;
                }
            }
        }
    }

}

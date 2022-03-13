package tree;

class Node {
    Node left;
    Node right;
    int value;

    public Node(int data) {
        this.value = data;
        this.left = null;
        this.right = null;
    }
}

public class NodeMgmt {
    Node head = null;

    public boolean insertNode(int data) {
        //CASE 1: Node가 하나도 없을 떄
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            //CASE 2: Node가 하나이상 들어가 있을 때
            Node findNode = this.head;
            while (true) {
                //Case 2-1 : 현재 Node의 왼쪽에 Node가 들어가야할 때
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                }
                //CASE 2-2 : 현재 노드의 오른쪽에 노드가 들어가야 할때
                else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        //CASE1 :Node가 하나도 없을 때
        if (this.head == null) {
            return null;
        }

        //CASE2 :노드가 하나 이상일 때
        else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
            return null;
        }
    }

    public boolean delete(int value) {//삭제할 노드
        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        //코너 케이스 1 : Node가 하나도 없을 때
        if (this.head == null) {
            return false;
        } else {
            //코너케이스 2 : Node 가 단지 하나만 있고 해당 Node가 삭제할 노드일 때
            if (this.head.value == value && this.head.right == null && this.head.left == null) {
                this.head = null;
                return true;
            }

            while (currNode != null) {
                if (currNode.value == value) {
                    searched = true;
                    break;
                } else if (value < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if (searched == false) {
                return false;
            }
        }
        //case 1 삭제할 노드가 Left 노드일 경우
        if (currNode.left == null && currNode.right == null) {
            if (currParentNode.value > value) {
                currParentNode = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }
            return true;

        } else if (currNode.left != null && currNode.right == null) {
            //case2-1 삭제할 노드가 Child 노드를 1개 가지고 있을 경우 (왼쪽)
            if (value < currParentNode.value) {
                currParentNode.left = currNode.left;
                currNode = null;
            } else {
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
        } else if (currNode.left == null && currNode.right != null) {
            //case2-2 삭제할 노드가 Child 노드를 1개 가지고 있을 경우 (오른쪽)
            if (value < currParentNode.value) {
                currParentNode.left = currNode.right;
                currNode = null;
            } else {
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(5);
        myTree.insertNode(6);

        Node testNode = myTree.search(3);

    }
}

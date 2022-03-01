package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) {

        //자료형에 매개변수를 넣어서, 큐에 들어갈 데이터의 타입을 저장해야합니다.
        Queue<Integer> queueInt = new LinkedList<Integer>();
        Queue<String> queueStr = new LinkedList<String>();

        //데이터 추가는 add(value) 또는 offer(value)를 사용
        queueInt.add(1);
        queueInt.offer(2);
        queueStr.offer("a");

        //queueInt 출력 ->해당 큐에 들어있는 아이템 리스트가 출력됨
        System.out.println(queueInt);

        //poll()은 큐의 첫번째값 반환, 해당값은 큐에서 삭제
        //remove도 똑같은 역할읋 수행함
        queueInt.poll();
        queueInt.remove();

        //다시출력
        System.out.println(queueInt);

        //프로그래밍 연습1 java ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
        //dequeue 기능 호출시. 큐에데이터가 없을 경우 null을 리넡하게함
        //다양한 데이터 타입을 다룰 수 있도록 java generic 타입 문법 활용해보기
        MyQueue<Integer> mq = new MyQueue<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());


    }
    public static class MyQueue<T>{
        private ArrayList<T> queue = new ArrayList<T>();

        public void enqueue(T item){
            queue.add(item);
        }
        public T dequeue(){
            if(queue.isEmpty()){
                return null;
            }
            return queue.remove(0);
        }
        public boolean isEmpty(){
            return queue.isEmpty();
        }
    }
}

package stack;

import java.util.ArrayList;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        //자료형 매개변수를 넣어서 스택에 들어갈 데이터 타입을 지정해야함
        Stack<Integer> stackInt = new Stack<Integer>();
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);

        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());
        System.out.println(stackInt.pop());

        //프로그래밍 연습
        //Java ArrayList 클래스를 활용해서 스택을 다루는 push pop 기능 구현해보기
        //pop호출시 스택에 데이터가 없을 경우 null호출
        // 다양한 데이터 타입을 다룰 수 있도록 generic 타입 문법 활용
        myStack<Integer> ms = new myStack<Integer>();

        ms.push(1);
        ms.push(2);
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());

    }
    public static class myStack<T>{

        private ArrayList<T> stack = new ArrayList<T>();

        public void push(T item){
            stack.add(item);
        }
        public T pop(){
            if(stack.isEmpty()){
                return null;
            }
            return stack.remove(stack.size()-1);
        }

        public boolean isEmpty(){
            return stack.isEmpty();
        }
    }
}

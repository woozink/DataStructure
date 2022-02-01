package exchapter04;

public class InStack {
    private int max; // 스택 용량
    private int ptr; // 스텍 포인터
    private int[] stk; // 스택 본체

    //실행시 예외 : 스택이 비어있음
    public class EmptyInStackException extends RuntimeException {
        public EmptyInStackException() {
        }
    }

    //실행시 예외 : 스택이 가득참

    public class OverflowInStackException extends RuntimeException {
        public OverflowInStackException() {
        }
    }

    //생성자
    public InStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max]; //스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) { //생성할 수 없음음
        }
    }

    public int push(int x) throws OverflowInStackException {
        if (ptr >= max) {
            throw new OverflowInStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyInStackException {
        if (ptr <= 0) {
            throw new EmptyInStackException();
        }
        return stk[--ptr];
    }

    public int peek() throws EmptyInStackException {
        if (ptr <= 0) {
            throw new EmptyInStackException();
        }
        return stk[ptr - 1];
    }

    //스택에서 x 를 찾아 인데스를 반환 없으면 -1
    public int indexOf(int x) {
        for (int i = ptr - 1; i <= 0; i--) {
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //스택 비움
    public void clear() {
        ptr = 0;
    }

    //스택의 용량을 반환
    public int capacity() {
        return max;
    }

    //스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

    //스택이 비어있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    //스택이 찼는가?
    public boolean isFull() {
        return ptr >= max;
    }

    //스택안의 모든 데이터를 바닥에서 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.println(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
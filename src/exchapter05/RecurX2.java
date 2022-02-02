package exchapter05;

import exchapter04.InStack;

public class RecurX2 {
    static void recur(int n) {
        InStack s = new InStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }
}

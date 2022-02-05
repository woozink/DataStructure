package exchapter06;

import exchapter04.InStack;

public class QuickSort2 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right){
        InStack lstack = new InStack(right - left +1);
        InStack rstack = new InStack(right - left +1);

        lstack.push(left);
        rstack.push(right);

        while (lstack.isEmpty() != true){
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int x = a[(left + right) /2];

            do{
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr --;
                if(pl <= pr){
                    swap(a, pl++, pr--);
                }
            }while(pl <= pr);

            if(left < pr){
                lstack.push(left);
                rstack.push(pr);
            }
            if(pl < right){
                lstack.push(pl);
                rstack.push(right);
            }
        }
    }
}

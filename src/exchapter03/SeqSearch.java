package exchapter03;

import java.util.Scanner;

public class SeqSearch {
    static int seqSearch(int []a, int n , int key){
        int i = 0;

        while (true){
            if( i == n){
                return -1;
            }
            if(a[i]==key){
                return i;
            }
            i++;
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟 수 ");
        int num = stdIn.nextInt();
        int[]x = new int[num];

        for(int i = 0; i <num; i++){
            System.out.println("x[ " + i + "] :");
            x[i] = stdIn.nextInt();

        }
        System.out.println("검색할 값 : ");// 키 값을 입력
        int key = stdIn.nextInt();
        int idx = seqSearch(x,num,key);

        if(idx == -1){
            System.out.println(" 그 값의 요소가 없다.");
        }
        else
            System.out.println(key + "은 x[" + idx + "]에 있습니다.");
    }
}

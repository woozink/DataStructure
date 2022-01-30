package exchapter02;

import java.util.Random;
import java.util.Scanner;

public class MaxofArrayRand {
    static int maxOf(int[] a){
        int max = a[0];
        for(int i =0; i<a.length; i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIN = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다. ");
        System.out.print("사람 수 : ");
        int num = stdIN.nextInt();

        int [] height = new int[num];

        System.out.println(" 키 값을 아래와 같습니다.");
        for(int i =0; i <num; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] :" + height[i]);
        }
        System.out.println("최대 값은 " + maxOf(height) + "입니당.");
    }
}

package preChapter01;

import java.util.Scanner;

public class Pramid1 {
    static void spira(int n ){
        for(int i =1; i <=n; i++){
            for (int j =1; j <=n - i +1; j ++){
                System.out.print(' ');
            }
            for(int j =1; j <= (i-1) *2 +1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("피라미드 모양으로 나타냅니다.");

        do{
            System.out.println(" 단수는 : ");
            n = stdIn.nextInt();
        }while ( n <=0);
        spira(n);
    }
}

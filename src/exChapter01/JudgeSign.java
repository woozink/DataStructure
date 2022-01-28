package exChapter01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner stdIN = new Scanner(System.in);

        System.out.println("정수를 입력하세요 ");
        int n = stdIN.nextInt();

        if (n>0){
            System.out.println("이수는 양수입니다.");
        }
        else if( n<0){
            System.out.println("이수는 음수 입니다.");
        }
        else{
            System.out.println("0입니다.");
        }
    }
}

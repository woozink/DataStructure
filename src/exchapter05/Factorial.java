package exchapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    static int factorial(int n){
        if(n>0){
            return n *factorial(n-1);
        }
        else return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        System.out.println(x + "의 팩토리얼은 " + factorial(x));
    }
}

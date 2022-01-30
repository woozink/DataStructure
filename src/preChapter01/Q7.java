package preChapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i < N) {
                System.out.print(i + " + " );
            }
            else{
                System.out.println(i);
            }
            sum += i;



        }
        System.out.println(" = " + sum + "입니다.");
    }
}

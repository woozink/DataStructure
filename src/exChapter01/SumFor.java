package exChapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum =0;

        for (int i =0; i<N; i++){
            sum += i;
        }
        System.out.println("n까지의 합은 " + sum + "입니다.");
    }
}

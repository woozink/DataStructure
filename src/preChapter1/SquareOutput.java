package preChapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("사각형을 출력합니다.");
        System.out.println("단 수 : ");

        int N = Integer.parseInt(br.readLine());
        for(int i =1; i <=N; i++){
            for (int j =1; j<=N; j ++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

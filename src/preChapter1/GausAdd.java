package preChapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GausAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = (1+N)*N/2;

        System.out.println(sum);


    }
}

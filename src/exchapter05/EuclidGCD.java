package exchapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class EuclidGCD {
    static int gcd(int x, int y){
        if(y ==0){
            return x;
        }
        else{
            return gcd(y, x%y);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a + "," + b+ "의 최대공약수는 " + gcd(a,b) );
    }
}

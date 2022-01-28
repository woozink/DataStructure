package preChapter1;

public class Min4m {
    static int min4(int a, int b, int c, int d){
        int min =a;
        if (b < min) min =b;
        if (c< min) min =c;
        if (d< min) min = d;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(" min(2,1,3,5) = " + min4(2,1,3,5));
        System.out.println(" min(3,1,5,2) = " + min4(3,1,5,2));
        System.out.println(" min(7,2,4,1) = " + min4(7,2,4,1));
    }
}

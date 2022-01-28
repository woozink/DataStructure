package preChapter1;

public class Min3m {
    static int min3(int a, int b, int c){
        int min =a;
        if (b < min) min =b;
        if (c< min) min =c;
        return min;

    }
    public static void main(String[] args) {
        System.out.println(" min(2,1,3) = " + min3(2,1,3));
        System.out.println(" min(3,1,5) = " + min3(3,1,5));
        System.out.println(" min(7,2,3) = " + min3(7,2,3));

    }
}

package preChapter1;

public class Max4m {
    static int max4(int a, int b, int c, int d){
        int max =a;
        if(a<b) max = b;
        if(c>b) max = c;
        if(d>c) max = d;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(2,1,3,4) = " + max4(2,1,3,4));
        System.out.println("max(3,1,2,5) = " + max4(3,1,2,5));
        System.out.println("max(6,1,3,7) = " + max4(6,1,3,7));

    }
}

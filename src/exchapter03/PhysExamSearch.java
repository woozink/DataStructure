package exchapter03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;

        }

        public static final Comparator<PhyscData> HEIGHT_ORDER
                = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("이나령 ", 162, 0.3),
                new PhyscData("김우진 ", 191, 0.7),
                new PhyscData("손흥민 ", 178, 0.6),
                new PhyscData("이나겸 ", 161, 0.5),
                new PhyscData("윤석열 ", 154, 0.4),
                new PhyscData("김범수 ", 197, 0.8),
                new PhyscData("오세창 ", 143, 0.9),
        };

        System.out.println("최대 몇 cm인 사람은 찾고 있나요? : ");
        int height =stdIn.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("",height,0.0),PhyscData.HEIGHT_ORDER);

        if(idx <0) System.out.println("요소가 없다");
        else {
            System.out.println("x[" + idx + "] 에 있다");
            System.out.println("찾은 데이터 :" + x[idx]);
        }
    }
}

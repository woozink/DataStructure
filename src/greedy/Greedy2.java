package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy2 {
    public Integer[][] objectList = {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};

    public void knapsackFunc(Integer[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] objectItem1, Integer[] objectItem2) {
                return (objectItem2[1] / objectItem2[0]) - (objectItem1[1] / objectItem1[0]);
            }

        });

        for (int i = 0; i < objectList.length; i++) {
            if ((capacity - (double) objectList[i][0]) > 0) {
                capacity -= (double)objectList[i][0];
                totalValue += (double)objectList[i][1];
                System.out.println("무게" + objectList[i][0] + "가치 " + objectList[i][1]);
            }else{
                fraction = capacity / (double)objectList[i][0];
                totalValue += (double)objectList[i][1] * fraction;
                System.out.println("무게" + objectList[i][0] + "가치 " + objectList[i][1] + "비율 " + fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치 " + totalValue);
    }

    public static void main(String[] args) {
        Greedy2 g2 = new Greedy2();
        g2.knapsackFunc(g2.objectList, 30.0);
    }
}

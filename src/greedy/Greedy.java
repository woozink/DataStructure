package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Greedy {

    public void coinFunc(int price, ArrayList<Integer>coinList){
        int totalCoinCount = 0;
        int coinNum = 0;
        ArrayList<Integer> details = new ArrayList<Integer>();

        for(int index = 0; index < coinList.size();index++){
            coinNum = price / coinList.get(index);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(index);
            details.add(coinNum);
            System.out.println(coinList.get(index) + "원" + coinNum + " 개");
        }
        System.out.println("총 동전 개수" + totalCoinCount);
    }
    public static void main(String[] args) {
        Greedy g = new Greedy();
        ArrayList<Integer> coinList  = new ArrayList<Integer>(Arrays.asList(500,100,50,1));
        g.coinFunc(4720, coinList);
    }
}

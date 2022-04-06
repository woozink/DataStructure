package greedy;

import java.util.*;

public class Greedy {

    public void coinFunc(int price, ArrayList<Integer>coinList){

        int totalCoinCount = 0;
        int coinNum =0;
        ArrayList<Integer> details = new ArrayList<Integer>();

        for(int i = 0; i < coinList.size(); i++){
            coinNum = price / coinList.get(i);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(i);
            details.add(coinNum);
            System.out.println(coinList.get(i) + "원" + coinNum +"개");
        }
        System.out.println("총 동전 개수" + totalCoinCount);
    }
    public static void main(String[] args) {
        Greedy g = new Greedy();
        ArrayList<Integer> coinList  = new ArrayList<Integer>(Arrays.asList(100,500,50,1));
        coinList.sort(Comparator.reverseOrder());
        g.coinFunc(4720, coinList);
    }
}

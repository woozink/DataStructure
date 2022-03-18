package sortAlgorithm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort  {
    public static void main(String[] args) throws IOException {

        // 연습해보기 1 데이터가 두개일 때
//        ArrayList<Integer> dataList = new ArrayList<Integer>();
//        dataList.add(4);
//        dataList.add(2);
//
//        if(dataList.get(0) > dataList.get(1)){
//            Collections.swap(dataList,0,1);
//        }
//        System.out.println(dataList);

        //연습해보기 2 데이터가 세개 일 때
//        ArrayList<Integer> dataList = new ArrayList<Integer>();
//        dataList.add(4);
//        dataList.add(2);
//        dataList.add(9);
//
//        for(int index =0; index < dataList.size()-1; index++){
//            if(dataList.get(index) > dataList.get(index +1)){
//                Collections.swap(dataList,index,index+1);
//            }
//        }
//        System.out.println(dataList);

        //연습해보기 3 여러개일 때
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        dataList.add(1);
        dataList.add(9);
        dataList.add(3);
        dataList.add(2);
        for(int i =0; i <10; i++){
            dataList.add((int)(Math.random()*100));
        }

        for(int index =0; index < dataList.size()-1; index++){
            boolean swap = false;
            for(int index2 = 0; index2 < dataList.size()-1-index; index2++){
                if(dataList.get(index2) > dataList.get(index2 +1)){
                    Collections.swap(dataList,index2,index2+1);
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
        System.out.println(dataList);
    }
}

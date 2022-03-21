package mergesort;

import java.util.ArrayList;
import java.util.Arrays;

//배열을 앞뒤 두 배열로 자르는 코드 작성해보기 (일반화)
class Split{
    public void splitFunc(ArrayList<Integer>dataList){
        if(dataList.size() <= 1){
            return;
        }
        int medium = dataList.size()/2;

        ArrayList<Integer>leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        leftArr = new ArrayList<Integer>(dataList.subList(0, medium)); // 0부터 medium -1 인덱스 번호까지 해당 데이터 배열 아이템을 서브 배열로 추출
        rightArr = new ArrayList<Integer>(dataList.subList(medium, dataList.size())); // medium 부터 배열의 끝 인덱스 번호까지 해당 데이터 배열 아이템을 서브 배열로 추출
        System.out.println(leftArr);
        System.out.println(rightArr);

    }
}


public class MergeSort {
    public static void main(String[] args) {
        Split sObject = new Split();
        sObject.splitFunc(new ArrayList<Integer>(Arrays.asList(4,1,2,3,5,8)));


    }
}

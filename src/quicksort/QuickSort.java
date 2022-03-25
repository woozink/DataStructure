package quicksort;


import java.util.ArrayList;
import java.util.Arrays;

class Split{
    public void splitFunc(ArrayList<Integer> dataList){
        if(dataList.size() <= 1){
            return;
        }
        int pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for(int index =1; index <dataList.size(); index++){
            if(dataList.get(index)>pivot){
                rightArr.add(dataList.get(index));
            }
            else{
                leftArr.add(dataList.get(index));
            }
        }

        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        mergedArr.addAll(leftArr);
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(rightArr);

        System.out.println(mergedArr);
    }
}
public class QuickSort {


    public static void main(String[] args) {

    }
}

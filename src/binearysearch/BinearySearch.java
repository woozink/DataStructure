package binearysearch;

import java.util.ArrayList;

public class BinearySearch {
    public Boolean searchFunc(ArrayList<Integer>dataList, Integer searchItem){
        if(dataList.size() ==1 && searchItem == dataList.get(0)){
            return true;
        }
        if(dataList.size() ==1 && searchItem != dataList.get(0)){
            return false;
        }
        if(dataList.size() ==0){
            return false;
        }

        int medium = dataList.size() /2;

        if(searchItem == dataList.get(medium)){
            return true;
        }else{
            if (searchItem < dataList.get(medium)) {
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(0, medium)),searchItem);
            }else{
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())),searchItem);
            }

        }
    }
    public static void main(String[] args) {

    }
}

package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        //new 키워드를 사용해서, 배열을 미리 선언하고, 데이터를 넣을 수 있음
//        Integer[] dataList = new Integer[10];
//        dataList[0] = 1;
//        System.out.println(dataList[0]);
//
//        // 직접 데이터를 선언시 넣을 수 도 있음
//        Integer dataList2[] = {5,4,3,2,1};
//        Integer dataList3[] = {1,2,3,4,5};
//
//        System.out.println(dataList3[2]);
//        System.out.println(Arrays.toString(dataList2));
        //배열의 내용을 모두 출력하려면 Arrays.toString(배열변수) 메서드를 사용하면 됨.

        //자바에서는 기본적으로 java.util패키지에 가변크기의 배열을 다룰 수 있는 ArrayList클래스도 제공하고 있음
        ArrayList<Integer> list1 = new ArrayList<Integer>(); //int형 테이터를 담을 수 있는 가변 길이의 배열 선언
        list1.add(1);
        list1.add(2);
        list1.get(0); //배열에 특정 아이템을 읽을시 get (인덱스 번호) 메서드 사용(굳이 sout ㄴㄴ)
        list1.set(0,5); // 0번 인덱스에 5를 넣어라.
        list1.get(0);
        list1.remove(0);
        list1.get(0);

        //배열의 길이 확인하기
        list1.size();

        //JAVA타입 에서는 기본 문법으로 다차원 배열도 작성가능
        Integer [][][] dataList4 = {
                {{1,2,3,},{4,5,6}},{{7,8,9},{10,11,12}}
        };

        //데이터 5인덱스로 지정해서 출력해보기
        System.out.println(dataList4[0][1][1]);
        System.out.println(dataList4[1][1][2]);

        //연습해보기
        //위 3차원 배열에서 8,10,12를 순서대로 각각의 라인에 출력해보기
        System.out.println(dataList4[1][0][1]);
        System.out.println(dataList4[1][1][0]);
        System.out.println(dataList4[1][1][2]);

        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };
        //연습해보기2
        // 위 1차원 배열에서, 문자 M을 가지고 있는 아이템의 수를 출력해보기

        int count =0;
        for(int i = 0; i < dataset.length; i++){
            if(dataset[i].indexOf("M") >0){
                count ++;
            }
        }
        System.out.println(count);

    }
}

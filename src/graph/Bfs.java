package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Bfs {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

        graph.put("A", new ArrayList<String>(Arrays.asList("B","C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A","D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A","G","H","I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B","E","F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C","J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));


        ArrayList<String> aList = new ArrayList<String>();
        aList.add("A");
        aList.add("B");
        String node = aList.remove(0);
        aList.add("C");
        aList.addAll(graph.get("A"));
        System.out.println(aList);

    }
}

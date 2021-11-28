package graph;

import java.util.*;

public class Graph {
    private Dictionary<String, List<String>> dict = new Hashtable<>();

    public void addToDict(String key, String value){
        if(dict.get(key) == null){
            List<String> neighbours = new ArrayList<>();
            neighbours.add(value);
            dict.put(key, neighbours);
            return;
        }
        dict.get(key).add(value);
    }

    public Dictionary<String, List<String>> getDict() {
        return dict;
    }
}


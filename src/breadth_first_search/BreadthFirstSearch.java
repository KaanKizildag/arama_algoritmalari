package breadth_first_search;

import graph.Graph;
import search_algorithm.SearchAlgoritm;

import java.util.*;

public class BreadthFirstSearch implements SearchAlgoritm {
    private Queue<String> queue = new LinkedList<>();
    private Dictionary<String, List<String>> graph;


    public BreadthFirstSearch(Graph graph){
        System.out.println("\nBreadth First Search\n");
        this.graph = graph.getDict();
    }

    @Override
    public void search(String start, String goal) {
        // hedef kontrolü

        if (start.equals(goal)) {
            System.out.printf("I found '%s'%n", goal);
            return;
        }
        addNeighbors(start);

        System.out.printf("%-70s | %s%n",queue.toString(), queue.peek());
        String current = queue.poll();

        search(current, goal);
    }

    private void addNeighbors(String currentNode) {
        // komşuları ekle
        if (graph.get(currentNode) != null) {
            queue.addAll(graph.get(currentNode));
        }
    }
}

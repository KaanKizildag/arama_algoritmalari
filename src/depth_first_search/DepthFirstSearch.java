package depth_first_search;

import graph.Graph;
import search_algorithm.SearchAlgoritm;

import java.util.Dictionary;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch implements SearchAlgoritm {
    // son giren ilk çıkar mantığı
    private Stack<String> stack = new Stack<>();
    private Dictionary<String, List<String>> graph;

    public DepthFirstSearch(Graph graph) {

        System.out.println("\nDepth First Search\n");
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
        System.out.printf("%-70s | %s%n", stack.toString(), stack.peek());
        String current = stack.pop();

        search(current, goal);
    }

    private void addNeighbors(String currentNode) {
        // komşuları ekle
        if (graph.get(currentNode) != null) {
            graph.get(currentNode).forEach(s -> {
                stack.push(s);
            });
        }
    }

}

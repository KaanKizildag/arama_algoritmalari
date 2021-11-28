import breadth_first_search.BreadthFirstSearch;
import depth_first_search.DepthFirstSearch;
import graph.Graph;

public class Main {


    public static void main(String[] args) {

        Graph graph = new Graph();
//        test1(graph);
        test2(graph);



    }

    private static void search(Graph graph, String start, String goal) {
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph);

        bfs.search(start, goal);

        DepthFirstSearch dfs = new DepthFirstSearch(graph);

        dfs.search(start, goal);
    }


    private static void test2(Graph graph) {
        graph.addToDict("S", "A");
        graph.addToDict("S", "B");
        graph.addToDict("S", "C");

        graph.addToDict("A", "D");
        graph.addToDict("A", "E");
        graph.addToDict("A", "G");

        graph.addToDict("B", "G");

        graph.addToDict("C", "G");
        search(graph, "S", "G");

    }

    private static void test1(Graph graph) {
        graph.addToDict("Oslo", "Helsinki");
        graph.addToDict("Helsinki", "Stockholm");
        graph.addToDict("Oslo", "Stockholm");
        graph.addToDict("Stockholm", "Copenhagen");
        graph.addToDict("Copenhagen", "Warsaw");
        graph.addToDict("Warsaw", "Bucharest");
        graph.addToDict("Bucharest", "Athens");
        graph.addToDict("Budapest", "Bucharest");
        graph.addToDict("Budapest", "Belgrade");
        graph.addToDict("Belgrade", "Sofia");
        graph.addToDict("Rome", "Palermo");
        graph.addToDict("Palermo", "Athens");

        graph.addToDict("Rome", "Milan");
        graph.addToDict("Milan", "Budapest");
        graph.addToDict("Vienna", "Budapest");
        graph.addToDict("Vienna", "Munich");
        graph.addToDict("Prague", "Vinnea");
        graph.addToDict("Prague", "Berlin");
        graph.addToDict("Berlin", "Copenhagen");
        graph.addToDict("Berlin", "Amsterdam");
        graph.addToDict("Munich", "Lyon");
        graph.addToDict("Lyon", "Paris");
        graph.addToDict("Lyon", "Bordeaux");

        graph.addToDict("Madrid", "Barcelona");
        graph.addToDict("Madrid", "Lisbon");
        graph.addToDict("Lisbon", "London");
        graph.addToDict("Barcelona", "Lyon");
        graph.addToDict("Paris", "London");
        graph.addToDict("London", "Duplin");
        graph.addToDict("London", "Glasgow");
        graph.addToDict("Glasgow", "Amsterdam");
        graph.addToDict("Budapest", "Prague");
        graph.addToDict("Barcelona", "Rome");
        graph.addToDict("Paris", "Bordeaux");
        graph.addToDict("Glasgow", "Duplin");

        search(graph, "Barcelona", "Bucharest");
    }

}

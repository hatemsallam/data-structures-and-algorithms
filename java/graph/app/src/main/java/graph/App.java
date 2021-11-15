/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {
      Graph graph = new Graph();

      graph.addVertex("Hatem");
      graph.addVertex("Tareq");
      graph.addVertex("Doaa");
      graph.addVertex("Mohammad");

      graph.addEdge("Hatem","Tareq");
      graph.addEdge("Hatem", "Doaa");
      graph.addEdge("Hatem", "Mohammad");
      graph.addEdge("Tareq","Doaa");
      graph.addEdge("Doaa","Mohammad");
      graph.addEdge("Mohammad", "Tareq");

      System.out.println(graph.printGraph());



      System.out.println();
      System.out.println(graph.getVertices());

      System.out.println();
      System.out.println(graph.getNeighbors("Tareq"));


      System.out.println();
      System.out.println(graph.size());

      //        <<< Code Challenge 36 >>>

      Graph graph1 = new Graph();

      graph1.addVertex("Hatem");
      graph1.addVertex("Tareq");
      graph1.addVertex("Doaa");
      graph1.addVertex("Mohammad");
      graph1.addVertex("Osaid");
      graph1.addVertex("Naim");

      graph1.addEdge("Hatem", "Tareq");
      graph1.addEdge("Tareq", "Doaa");
      graph1.addEdge("Tareq", "Mohammad");
      graph1.addEdge("Doaa", "Osaid");
      graph1.addEdge("Doaa", "Naim");
      graph1.addEdge("Doaa", "Mohammad");
      graph1.addEdge("Mohammad", "Naim");
      graph1.addEdge("Osaid", "Naim");


      System.out.println(graph1.breadthTraverse( "Hatem"));


//        <<< Code Challenge 37 >>>

      Graph graph2 = new Graph();

      graph2.addVertex("Pandora");
      graph2.addVertex("Arendelle");
      graph2.addVertex("Metroville");
      graph2.addVertex("Monstroplolis");
      graph2.addVertex("Narnia");
      graph2.addVertex("Naboo");

      graph2.addEdgeWithWeight("Pandora", "Arendelle", 150);
      graph2.addEdgeWithWeight("Arendelle", "Metroville",99);
      graph2.addEdgeWithWeight("Arendelle", "Monstroplolis",42);
      graph2.addEdgeWithWeight("Metroville", "Narnia",37);
      graph2.addEdgeWithWeight("Metroville", "Naboo",26);
      graph2.addEdgeWithWeight("Metroville", "Monstroplolis",105);
      graph2.addEdgeWithWeight("Monstroplolis", "Naboo",73);
      graph2.addEdgeWithWeight("Narnia", "Naboo",250);

      List<String> cities = new ArrayList<>();
      cities.add("Pandora");
      cities.add("Arendelle");
      cities.add("Monstroplolis");

      System.out.println("First Trip ---> "+graph2.businessTrip(graph2,cities));


    }
}

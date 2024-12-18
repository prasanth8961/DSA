import java.io.*;
import java.util.*;


class Graph{
 private static Map<String, List<String>> _graph;
 public Graph(){
  _graph = new HashMap<>();
  _graph.put("A" , new ArrayList<>(Arrays.asList("B" , "C")));
  _graph.put("B" , new ArrayList<>(Arrays.asList("C" , "D")));
  _graph.put("C" , new ArrayList<>(Arrays.asList("E" , "F")));
  _graph.put("D" , new ArrayList<>(Arrays.asList("I" , "J")));
  _graph.put("E" , new ArrayList<>(Arrays.asList("F")));
  _graph.put("F" , new ArrayList<>(Arrays.asList("G" , "H")));
  _graph.put("G" , new ArrayList<>(Arrays.asList("E")));
  _graph.put("H" , new ArrayList<>(Arrays.asList("I" , "K")));
  _graph.put("I" , new ArrayList<>(Arrays.asList("J")));
  _graph.put("J" , new ArrayList<>(Arrays.asList("K")));
  _graph.put("K" , new ArrayList<>(Arrays.asList("I")));
}
 private static boolean graphContains(String vertex){
  return _graph.get(vertex).size() > 0;
 }
 public static int vertexCount(){
  return _graph.size();
}
 public static void addNode(String vertex , List<String> edges){
  if(!graphContains(vertex)){
    _graph.put(vertex , edges);
  }else{
    List<String> neighbors = _graph.get(vertex);
    for(String edge : edges){
     if(!neighbors.contains(edge)){
       neighbors.add(edge);
    }
   }
   _graph.put(vertex , neighbors);
  }
 }
 public static Map<String , List<String>> getGraph(){
   return _graph;
 }
}

class StackFrontier{
  private static String[]  _stack;
  private static int top;
  private static int max;
 public StackFrontier(int size){
  _stack = new String[size];
  top = -1;
  max = size;
}
public static void push(String vertex){
 if(top < max){
  _stack[top++] = vertex;
 }
}
 public static String pop(){
 if(top >= 0){
   String x = _stack[top--];
   return x;
 }
 return "";
}
 public static String peek(){
 if(top > 0)
     return _stack[top];
 return "";
}
public static boolean isEmpty(){
  return top == -1;
 }
}

class QueueFrontier{
   private String[] _queue;
   private int front;
   private int rear;
  public QueueFrontier(int size){
   _queue = new String[size];
   int front = size - 1;
   int rear = size  - 1;
 }
public static void enque(String vertex){}
//public static String deque(){}
}


class UnInformedSearch{

public static void bfs(){}

public static void dfs(){}

public static void displayGraph(Map<String , List<String>> graph){
 List<String> vertices = new ArrayList<>(graph.keySet());
  Map<String , Boolean> visited = new HashMap<>(); 
 for(int i = 0; i < vertices.size(); i++){
    visited.put(vertices.get(i), false);
    System.out.println(vertices.get(i) + " : " + graph.get(vertices.get(i)) + "  ");
 }
}
public static void main(String args[]){
  Graph graph  = new Graph();
  StackFrontier stackFrontier = new StackFrontier(graph.vertexCount());
  displayGraph(graph.getGraph());
 }
}



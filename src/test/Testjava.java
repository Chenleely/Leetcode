package test;

import java.util.List;

import algrithms.Heap;
import algrithms.HeapSort;
import answer.num_1;
import array.RemoveDuplicates;
import array.RemoveDuplicates_two;
import array.ReverseVowels;
import array.ThreeSum;
import array.move_zero;
import map.BreadthFirstSearch;
import map.DepthFirstSearch;
import map.Graph;
import map.Graphs;

public class Testjava {
   public static void main(String[] args) {
      // int E=5;
      // int[][] map=new int[E][E];
      // for(int i=0;i<E;i++){
      //    for(int j=0;j<E;j++){
      //       System.out.print(map[i][j]+" ");
      //    }
      //    System.out.println("");
      // }
      // System.out.println("---------------------");
      
      // Graph graph=new Graph(3, 3, map);
      // graph.addEdge(1, 2);
      // graph.addEdge(0, 1);
      // System.out.println(graph.degree(1));

      // System.out.println("---------------------");
      // for(int i=0;i<E;i++){
      //    for(int j=0;j<E;j++){
      //       System.out.print(map[i][j]+" ");
      //    }
      //    System.out.println("");
      // }
      int E=6;
      Graphs graphs=new Graphs(E);  
      graphs.addEdge(0,2);
      graphs.addEdge(0,5);
      graphs.addEdge(0,1);
      graphs.addEdge(1,2);
      graphs.addEdge(2,3);
      graphs.addEdge(2,4);
      graphs.addEdge(3,4);
      graphs.addEdge(3,5);   
      graphs.getEdges();
      System.out.println("---------------");
      // DepthFirstSearch dfs=new DepthFirstSearch(graphs, 0);
      // System.out.println("与结点 0连通的结点有: "+dfs.count()+"个");
      //  System.out.println("0-5的路径："+dfs.pathTo(5));
      BreadthFirstSearch bfs=new BreadthFirstSearch(graphs,0);
      // System.out.println("0 to "+4+": "+bfs.pathTo(4));

      for(int i=0;i<6;i++){
         System.out.println("0 to "+i+": "+bfs.pathTo(i));
      }
   }
}

      

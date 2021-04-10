package map;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//广度优先搜索
public class BreadthFirstSearch {
    /* 
        采用优先队列实现（先入先出队列）
        首先将起点加入队列，然后重复以下步骤直到队列为空：
            取队列的下一个顶点v并标记它
            将与v相邻的所有未标记的顶点加入队列
    */  
    //利用bfs寻找最短路径（长度为1）
    private boolean[] marked;//到某点的最短路径是否已知
    private int[] edgeTo;//记录每个与s相连的结点回到s的路径
    private final int s;//起点
    private Graphs graphs;
    
    public BreadthFirstSearch(Graphs graphs,int s){
        marked=new boolean[graphs.getV()];
        edgeTo=new int[graphs.getV()];
        this.s=s;
        bfs(graphs, s);
    }
    private void bfs(Graphs graphs,int s){
        Queue<Integer> queue=new LinkedList<Integer>();
        marked[s]=true;
        queue.offer(s);
        while(!queue.isEmpty()){
            int v=queue.poll();
            for(int w:graphs.adj(v)){
                if(!marked[w]){
                    edgeTo[w]=v;
                    marked[w]=true;
                    queue.offer(w);
                }
            }
        }
    }
    public boolean hasPathTo(int v){//结点v是否可达
        return marked[v];
    }
    //s到v的路径
    public List<Integer> pathTo(int v){
        if(!hasPathTo(v)) return null;
        Deque<Integer> path=new LinkedList<Integer>();
        for(int x=v;x!=s;x=edgeTo[x]){
            path.push(x);
        }
        path.push(s);
        return new LinkedList<Integer>(path);
    }

}
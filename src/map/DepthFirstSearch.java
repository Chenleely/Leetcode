package map;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//深度优先搜索
public class DepthFirstSearch {
    /* 
        Key-point:
        访问一个结点时：
            将它标记为已经访问
            递归访问它的所有未被标记的邻接结点
    */
    private boolean[] marked;//用于标记结点状态
    private int count=-1;//连通的结点数目
    private Graphs graphs;
    private int[] edgeTo;//记录两顶点之间的路径
    private final int s;//起点
    public DepthFirstSearch(Graphs graphs,int s){
        marked=new boolean[graphs.getV()];
        edgeTo=new int[graphs.getV()];
        this.graphs=graphs;
        dfs(graphs, s);
        this.s=s;
    }
    private void dfs(Graphs graphs,int v){
        marked[v]=true;
        count++;
        for(int w:graphs.adj(v)){
            
            if(!marked[w]) {
                edgeTo[w]=v;//v到w可达，记录该路径
                dfs(graphs, w);
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
    public boolean marked(int w){
        return marked[w];
    }
    public int count(){
        return count;
    }
}
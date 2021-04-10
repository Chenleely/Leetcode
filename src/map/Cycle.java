package map;
//判断g是不是无环图
public class Cycle {
    private boolean[] marked;
    private boolean hasCycle;
    private Graphs graphs;
    public Cycle(Graphs graphs){
        marked=new boolean[graphs.getV()];
        this.graphs=graphs;
        for(int s=0;s<graphs.getV();s++){
            if(!marked[s]){
                dfs(graphs,s,s);
            }
        }
    }  
    private void dfs(Graphs graphs,int v,int u){
        marked[v]=true;
        for(int w:graphs.adj(v)){
            if(!marked[w]){
                dfs(graphs, w, v);
            }else if(w!=u) hasCycle=true;//如果访问过，且不是起点，那么就构成了环
        }
    }
    public boolean hasCycle(){
        return hasCycle;
    }
}
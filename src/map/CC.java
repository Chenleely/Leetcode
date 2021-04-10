package map;
//利用DFS找出图中所有连通分量
public class CC {
    private boolean[]  marked;
    private int[] id;
    //如果V属于第i个连通分量，那么id[v]的值为i
    private int count;
    private Graphs graphs;
    public CC(Graphs graphs){
        this.graphs=graphs;
        marked=new boolean[graphs.getV()];
        id=new int[graphs.getV()];
        for(int s=0;s<graphs.getV();s++){
            if(!marked[s]){
                dfs(graphs, s);
                count++;
            }
        }
        
    }
    private void dfs(Graphs graphs,int v){
        marked[v]=true;
        id[v]=count;
        for(int w:graphs.adj(v)){
            if(!marked[w]){
                dfs(graphs, w);
            }
        }
    }
    public boolean connected(int v,int w){
        return id[v]==id[w];
    }
    public int id(int v){
        return id[v];
    }
    public int count(){
        return count;
    }
}
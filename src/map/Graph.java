package map;

import java.util.ArrayList;
import java.util.List;

//考虑无向图情形
public class Graph {
    private int V=0;//顶点数
    private int E=0;//边数
    private int[][] edges;

    //二维数组存储
    public Graph(int v,int e,int[][] edges){
        this.E=e;
        this.V=v;
        this.edges=edges;
    }
    
    public int getE() {
        return E;
    }
    public int getV() {
        return V;
    }
    
    //向数组中添加一条边v-w
    public void addEdge(int v,int w){
        if(edges[v][w]==0&&edges[w][v]==0){
            edges[v][w]=1;
            edges[w][v]=1;
            this.E++;
        }
    }

    //返回和v相邻的所有顶点
    public List<Integer> adj(int v){
        List<Integer> adjtov=new ArrayList<Integer>();
        for(int i=0;i<this.V;i++){
            if(i==v){continue;}
            if(edges[i][v]==1){adjtov.add(i);}
        }
        return adjtov;
    }

    //计算v的度数
    public int degree(int v){
        int degree=0;
        for(int i=0;i<this.E;i++){
            if(i==v){continue;}
            if(edges[i][v]==1){degree++;}
        }
        return degree;
    }
}
package map;

import java.util.ArrayList;
import java.util.List;


//无向图的邻接链表表示
public class Graphs {
    private class ENode{
        int index;//结点的序号
        int weight;//边的权值
        ENode next;
        public ENode(int index){
            this.index=index;
        }
    }

    private ENode[] enodes;//结点的集合
    private int edge;//边的条数
    private int V;//结点数

    public Graphs(int v){
        this.enodes=new ENode[v];
        edge=0;
        this.V=v;
        for(int i=0;i<V;i++){
            ENode node=new ENode(i);
            enodes[i]=node;
        }
    }
    public int getEdge() {
        return edge;
    }
    public ENode getEnode(int index) {
        return enodes[index];
    }
    public int getV() {
        return V;
    }
    public void addEdge(int v,int w){
        ENode adjv=new ENode(w);
        ENode adjw=new ENode(v);
        ENode nodev=enodes[v];
        while(nodev.next!=null){
            nodev=nodev.next;
        }
        nodev.next=adjv;

        ENode nodew=enodes[w];
        while(nodew.next!=null){
            nodew=nodew.next;
        }
        nodew.next=adjw;
        this.edge++;
    }
    public List<Integer> adj(int v){
        List<Integer> adjtov=new ArrayList<>();
        ENode node=enodes[v];
        while(node!=null){
            adjtov.add(node.index);
            node=node.next;
        }
        return adjtov;
    }







    
    public void getEdges(){
        for(int i=0;i<this.V;i++){
            ENode node=enodes[i];
            System.out.print("结点 "+i+"   邻接结点:");
            if(node.next==null){continue;}
            node=node.next;
            while(node!=null){
                System.out.print(" "+node.index);
                node=node.next;
            }
            System.out.println(" ");
        }
        System.out.println("---------------");
        // System.out.println("边集合：");
        // for(int i=0;i<this.V;i++){
        //     ENode node=enodes[i];
        //     if(node.next==null){continue;}
        //     node=node.next;
        //     while(node!=null){
        //         System.out.print(i+" "+node.index);
        //         node=node.next;
        //         System.out.println(" ");
        //     }
        // }
    }
}
package Answer;

import java.util.*;

public class num_365 {
    public int GCD(int a,int b) {
        if(b==0)
            return a;
        else
            return GCD(b,a%b);
    }
    public boolean canMeasureWater(int x, int y, int z) {
        if(z==0) return true;
        if(x+y<z) return false;
        Set<State> visit=new HashSet<>();
        Queue<State> queue=new LinkedList<>();
        State state0=new State(0,0);
        queue.offer(state0);
        visit.add(state0);
        while (!queue.isEmpty()){
            State curState=queue.poll();
            int curX=curState.getX();
            int curY=curState.getY();
            State newState1=new State(x,curY);
            State newState2=new State(curX,y);
            State newState3=new State(0,curY);
            State newState4=new State(curX,0);
            State newState5=new State(curX-(y-curY),y);
            State newState6=new State(0,curY+curX);
            State newState7=new State(x,curY-(x-curX));
            State newState8=new State(curX+curY,0);
        }
        return false;
    }
    /*public List<State> getNewStates(int curX,int curY,int x,int y){
        List<State> list=new ArrayList<>(8);
        //load A until A is full
        State newState1=new State(x,curY);
        //load B until B is full
        State newState2=new State(curX,y);
        //clear A
        State newState3=new State(0,curY);
        //clear B
        State newState4=new State(curX,0);
        //remove water from A to B until B is full and A is not empty
        State newState5=new State(curX-(y-curY),y);
        //remove water from A to B until B is full and A is empty,but B is not full
        State newState6=new State(0,curY+curX);
        //remove water from B to A until A is full,and B is not empty
        State newState7=new State(x,curY-(x-curX));
        //remove water from B to A until A is full and B is empty,but A is not full
        State newState8=new State(curX+curY,0);
        if(curX<x) list.add(newState1);
        if(curY<y) list.add(newState2);
        if(curX>0) list.add(newState3);
        if(curY>0) list.add(newState4);
        if((curX-(y-curY))>0) list.add(newState5);
        if(curX+curY<y) list.add(newState6);
        if((curY-(x-curX))>0) list.add(newState7);
        if(curX+curY<x) list.add(newState8);
        return list;
    }*/
    class State{
        private int x;
        private int y;
        public State(int x,int y){
            this.x=x;
            this.y=y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }


}

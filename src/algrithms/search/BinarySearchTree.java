package algrithms.search;

import answer.num_1;

public class BinarySearchTree<Key extends Comparable<Key>,Value>{
    private Node root;
    private class Node{
        private Key key;
        private Value val;
        private Node left,right;
        private int N;
        public Node(Key key,Value val,int N){
            this.key=key;
            this.val=val;
            this.N=N;
        }
    }
    public int size(){
        return size(root);
    }
    private int size(Node x){
        if(x==null){return 0;}
        else{
            return x.N;
        }
    }

    public Value get(Key key){
        return get(root,key);
    }
    private Value get(Node x,Key key){
        if(x==null){return null;}
        int cmp=key.compareTo(x.key);
        if(cmp>0){
            //如果比根结点大，就去右子树中寻找，否则就去左子树上寻找
            return get(x.right,key);
        }else if(cmp<0){
            return get(x.left,key);
        }else{
            return x.val;
        }
    }
    
    public void put(Key key,Value val){
        //查找Key,如果找到就更新值，找不到则为它新建一个新的结点
        root=put(root, key, val);
    }
    private Node put(Node x,Key key,Value val){
        if(x==null) return new Node(key,val,1);
        int cmp=key.compareTo(x.key);
        if(cmp<0){
            x.left=put(x.left, key, val);
        }else if(cmp>0){
            x.right=put(x.right, key, val);
        }else{
            x.val=val;
        }
        x.N=size(x.left)+size(x.right)+1;
        return x;
   }
   
   public Key min(){
        return min(root).key;
   }
   private Node min(Node x){
       if(x.left==null) return x;
       return min(x.left);
   }

   //找出排名为K的结点
   public Key select(int k){
        return select(root,k).key;
   }
   private Node select(Node x,int k){
        if(x==null) return null;
        int t=size(x.left);
        if(t>k) {
            return select(x.left, k);
        }else if(t<k){
            return select(x.right,k-t-1);
        }else{
            return x;
        }
   }

   public void deleteMin(){
        root=deleteMin(root);
   }
   private Node deleteMin(Node x){
        if(x.left==null) return x.right;
        x.left=deleteMin(x.left);
        x.N=size(x.left)+size(x.right)+1;
        return x;
   }

   public void delete(Key key){
        root=delete(root, key);
   }
   private Node delete(Node x,Key key){
        if(x==null){return null;}
        int cmp=key.compareTo(x.key);
        if(cmp>0){
            return delete(x.right,key);
        }else if(cmp<0){
            return delete(x.left ,key);
        }else{  
            if(x.right==null){return x.left;}
            if(x.left==null){return x.right;}
            Node t=x;
            x=min(t.right);
            x.right=deleteMin(t.right);
            x.left=t.left;
        }
        x.N=size(x.left)+size(x.right)+1;
        return x;
   }




}


package answer;
import java.util.Queue;
import java.util.Stack;

public class num_100 {
    //另一种用队列实现的方法之后来做
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        return (isSameTree(p.right,q.right)&&isSameTree(p.left,q.left));*/

//思路类似于bfs算法的队列实现
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(p);
        stack2.push(q);
        while (!stack1.empty()&&!stack2.empty()){
            TreeNode p1=stack1.pop();
            TreeNode q1=stack2.pop();
            if(p1==null&&q1==null) continue;
            if(p1!=null&&q1!=null&&p1.val==q1.val){
                stack1.push(p1.left);
                stack1.push(p1.right);
                stack2.push(q1.left);
                stack2.push(q1.right);
            }else {
                return false;
            }
        }
        return true;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

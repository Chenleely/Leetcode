package Answer;

import java.util.LinkedList;
import java.util.Queue;

public class num_98 {
    public boolean isValidBST(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if (root==null) return true;
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode thisroot=queue.poll();
            TreeNode left=thisroot.left;
            TreeNode right=thisroot.right;
            if(right!=null&&right.val<=thisroot.val) return false;
            if(left!=null&&left.val>=thisroot.val) return false;
            queue.offer(left);
            queue.offer(right);
        }
        return true;
    }
}

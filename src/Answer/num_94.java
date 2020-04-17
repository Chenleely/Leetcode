package Answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class num_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null||!stack.empty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            list.add(root.val);
            root=root.right;
        }
        return list;
        //bst(root,list);
    }
    public void bst(TreeNode root,List<Integer> list){
        if(root==null) return;
        bst(root.left,list);
        list.add(root.val);
        bst(root.right,list);
    }
}

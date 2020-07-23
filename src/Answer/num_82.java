package answer;

import java.util.HashSet;
        /*（第一版我的代码有问题，参考了另一位大佬的题解）
            核心思想就是用一对快慢指针简单记为s,f，循环条件为:s.next!=null(而不是f.next！=null)
            每次循环检测：s.next.val是否等于f.next.val，如果他们相等，那么就让快指针移动，慢指针不动，并且设一个标记flag让它等于1，如果未进入循环则flag为0.
            然后跳出内层循环后，将s.next到f.next之间的节点全部删除
            如果不相等，直接让快慢指针都向前移动1.
         */
public class num_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode slownode = prev, fastnode = head;
        int flag = 0;
        while (slownode.next != null) {
            while (fastnode.next != null && fastnode.next.val == slownode.next.val) {
                fastnode = fastnode.next;
                flag = 1;//如果有重复节点则flag置为1
            }
            if (flag == 1) {
                slownode.next = fastnode.next;//删掉重复节点
                fastnode = fastnode.next;//
                flag = 0;
            } else {
                slownode = fastnode;//指针后移!p1,p2都向后移动一下
                if (fastnode.next != null) fastnode = fastnode.next;
            }
        }
        return prev.next;
    }
}

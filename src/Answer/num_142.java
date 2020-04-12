package Answer;

import java.util.HashSet;

public class num_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode node;
        node=head;
        HashSet<ListNode> set=new HashSet<>();
        while (node.next!=null){
            if(set.contains(node)){
                return node;
            }
            node=node.next;
        }
        return node;
        /*ListNode fast = head, slow = head; ListNode tmp=head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                break;
            }
        }
        while (slow != tmp) {
            slow = slow.next;
            tmp = tmp.next;
        }
        return tmp;*/

    }
}



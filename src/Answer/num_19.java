package Answer;

public class num_19 {
       /* ListNode dummy = new ListNode(0);
        dummy.next = head;//解法一，采用两次扫描
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;*/
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy=new ListNode(0);
            dummy.next=head;
            ListNode first=dummy;
            ListNode second=dummy;
            for(int i=1;i<=n+1;i++){
                first=first.next;
            }
            while (first!=null){
                first=first.next;
                second=second.next;
            }
            second.next=second.next.next;
            return dummy.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;next=null;}
}


//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
/*示例：给定一个链表: 1->2->3->4->5, 和 n = 2.
当删除了倒数第二个节点后，链表变为 1->2->3->5.*/
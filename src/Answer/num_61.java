package answer;

        /*
        给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
        循环找到链表长度n和链表尾，然后算一下k/n的余数，这时候迅雷不及掩耳盗铃之势把链表连成环，然后从尾部开始往前走n-k步，在这里断开这个环，然后返回头指针。
        */
public class num_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode oldtail,oldhead;
        oldhead=head;
        int length=1;
        for(oldtail=oldhead;oldtail.next!=null;oldtail=oldtail.next){
            length++;
        }
        oldtail.next=oldhead;

        ListNode newtail,newhead;
        newhead=head;
        int changeindex=length-k%length;
        newtail=head;
        for(int i=0;i<changeindex-1;i++){
            newtail=newtail.next;
        }
        newhead=newtail.next;
        newtail.next=null;
        return newhead;
    }
}

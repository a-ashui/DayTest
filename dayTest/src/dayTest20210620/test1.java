package dayTest20210620;

/**
 *假设链表中每一个节点的值都在 0 - 9 之间，那么链表整体就可以代表一个整数。
 * 给定两个这种链表，请生成代表两个整数相加值的结果链表。
 * 例如：链表 1 为 9->3->7，链表 2 为 6->3，最后生成新的结果链表为 1->0->0->0。
 *
 * 示例1
 * 输入：
 * [9,3,7],[6,3]
 * 返回值：
 * {1,0,0,0}
 */

public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;
    }
    /**
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode l1=reverse(head1);
        ListNode l2=reverse(head2);
        ListNode result=new ListNode();
        int c=0;
        while(l1!=null||l2!=null||c!=0)
        {
            int v1=l1!=null?l1.val:0;
            int v2=l2!=null?l2.val:0;
            int val=v1+v2+c;
            c=val/10;
            ListNode cur=new ListNode();
            cur.next=result.next;
            result.next=cur;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return result.next;
    }

    public ListNode reverse(ListNode node){

        if(node==null) return node;
        ListNode pre=null,next=null;
        while(node!=null)
        {
            next=node.next;
            node.next=pre;
            pre=node;
            node=next;
        }
        return pre;
    }

}

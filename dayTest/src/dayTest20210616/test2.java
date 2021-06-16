package baiyong2;

/**
 * 输入两个无环的单链表，找出它们的第一个公共结点。（注意因为传入数据是链表，
 * 所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 *
 */


public class test2 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        while(head1 != null){
            while(head2 != null){
                if(head1 == head2){
                    return head1;
                }
                head2 = head2.next;
            }
            head1 = head1.next;
            head2 = pHead2;
        }
        return null;
    }
}

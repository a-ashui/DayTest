package dayTest20210610;

/**
 * 给定一个单链表，请设定一个函数，将链表的奇数位节点和偶数位节点分别放在一起，重排后输出。
 * 注意是节点的编号而非节点的数值。
 *
 * 输入：
 * {1,2,3,4,5,6}
 * 返回值：
 * {1,3,5,2,4,6}
 *
 * 说明：
 * 1->2->3->4->5->6->NULL
 * 重排后为
 * 1->3->5->2->4->6->NULL
 */
public class test2 {
    public class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类
     * @return ListNode类
     */

    public ListNode oddEvenList (ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode cur = head;
        ListNode pre = head.next;
        ListNode recur = head.next;
        while(pre != null && pre.next != null){
            cur.next = pre.next;
            cur = cur.next;
            cur.next = pre.next;
            pre = pre.next;
        }
        cur.next = recur;
        return head;
    }
}

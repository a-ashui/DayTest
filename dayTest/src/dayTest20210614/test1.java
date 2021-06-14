package baiyong3;

/**
 * 将一个链表\ m m 位置到\ n n 位置之间的区间反转，要求时间复杂度 O(n)O(n)，空间复杂度 O(1)O(1)。
 * 例如：
 * 给出的链表为 1\to 2 \to 3 \to 4 \to 5 \to NULL1→2→3→4→5→NULL, m=2,n=4m=2,n=4,
 * 返回 1\to 4\to 3\to 2\to 5\to NULL1→4→3→2→5→NULL.
 *
 * 输入：
 * {1,2,3,4,5},2,4
 * 返回值：
 * {1,4,3,2,5}
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val){
            this.val = val;
        }
    }
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode start = head;
        for (int i = 1; i < m; i++) {
            pre = start;
            start = start.next;
        }
        for (int i = 0; i < m-n; i++) {
            ListNode tmp = start.next;
            start.next = tmp.next;
            tmp.next = pre.next;
            pre.next = tmp;
        }
        return dummy.next;
    }
}

package dayTest20210607;

import java.util.Stack;

/**
 * 给定一个链表，请判断该链表是否为回文结构。
 *
 * 示例1
 * 输入：
 * [1,2,2,1]
 * 返回值：
 * true
 */
public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;
    }
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Stack<Integer> stack = new Stack<>();
        while(slow != null){
            stack.add(slow.val);
            slow = slow.next;
        }
        while(!stack.empty()){
            if(stack.pop() != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}

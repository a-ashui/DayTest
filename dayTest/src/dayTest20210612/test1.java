package beiyong2;

/**
 * 给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素。
 * 例如：
 * 给出的链表为1→2→3→3→4→4→5, 返回1→2→5.
 * 给出的链表为1→1→1→2→3, 返回2→3.
 */

import java.util.*;
public class test1 {
    public class ListNode {
        int val;
        ListNode next = null;
    }
    /**
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates (ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode newHead = new ListNode();
        ListNode cur = head;
        newHead.next = head;
        ListNode last = newHead;
        while(cur != null && cur.next != null){
            if(cur.val != cur.next.val){
                last = cur;
            }else {
                while( cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                last.next = cur.next;
            }
        }
        return newHead.next;
    }
}

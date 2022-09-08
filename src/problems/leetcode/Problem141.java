package problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem141 {
    //    Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public static ListNode constructorUsingArrayList(ArrayList<Integer> list){
            ListNode head = new ListNode(list.get(0));
            ListNode pointer = head;
            for (int i = 1; i < list.size(); i++) {
                pointer.next = new ListNode(list.get(i));
                pointer= pointer.next;
            }
            return head;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
    }

}

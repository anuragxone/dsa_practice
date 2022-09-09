package problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem141 {

    public static void main(String[] args) {
        ListNode eight = new ListNode(8);
        ListNode seven = new ListNode(7,eight);
        ListNode six = new ListNode(6,seven);
        ListNode five = new ListNode(5,six);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3,four);
        ListNode two = new ListNode(2,three);
        ListNode one = new ListNode(1, two);

        eight.next = four;

        System.out.println(hasCycle(one));
        System.out.println(lengthOfCycle(one));

    }
    //    Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
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
        public void insertLast(ListNode node){
            if(this == null){
                return;
            }
            if(this.next == null){
                this.next = node;
                return;
            }
            ListNode pointer = this;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = node;
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

    public static int lengthOfCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;


            if (fast == slow) {
                ListNode temp = slow;
                int count = 0;
                do {
                    temp = temp.next;
                    count++;
                } while (temp != fast);
                return count;

            }
        }
        return -1;
    }

}

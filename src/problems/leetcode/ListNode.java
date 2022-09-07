package problems.leetcode;

import java.util.ArrayList;

public class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void display(ListNode head) {
        ListNode pointer = head;
        while (pointer != null) {
            System.out.print(pointer.val + " -> ");
            pointer = pointer.next;
        }
        System.out.println("null");
    }

//    public static void insertLast(ListNode head, int val){
//        if(head==null || head.next == null){
//            return;
//        }
//        ListNode pointer = head;
//        while(pointer.next != null){
//            pointer = pointer.next;
//        }
//        pointer.next = new ListNode(val);
//    }

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

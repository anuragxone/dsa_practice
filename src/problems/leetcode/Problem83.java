package problems.leetcode;

public class Problem83 {

    public static void displaySinglyLinkedList(ListNode head) {
        ListNode pointer = head;
        while (pointer != null) {
            System.out.print(pointer.val + " -> ");
            pointer = pointer.next;
        }
        System.out.println("null");
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (pointer.next != null) {
            if (pointer.val == pointer.next.val) {
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode four = new ListNode(3);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);
        ListNode head = new ListNode(1, one);

        displaySinglyLinkedList(head);
        ListNode ansHead = deleteDuplicates(head);

        displaySinglyLinkedList(ansHead);

    }
}

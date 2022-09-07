package problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem21 {
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode ansHead = new ListNode();
        ListNode ans = ansHead;


        while(pointer1.next != null || pointer2.next != null){
            if(pointer1.val <= pointer2.val){
                ansHead.insertLast(pointer1);
                ans.next=pointer2;
                ans = ans.next;
            }else{
                ansHead.insertLast(pointer2);
                ans.next = pointer1;
                ans=ans.next;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return ansHead;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,4);
        List<Integer> list2 = Arrays.asList(1,3,4);
        ArrayList<Integer> arrayList1= new ArrayList<>(list1);
        ArrayList<Integer> arrayList2= new ArrayList<>(list2);

        ListNode head1 = ListNode.constructorUsingArrayList(arrayList1);
        ListNode head2 = ListNode.constructorUsingArrayList(arrayList2);

        ListNode ans = mergeTwoLists(head1, head2);

        ListNode.display(ans);
    }
}

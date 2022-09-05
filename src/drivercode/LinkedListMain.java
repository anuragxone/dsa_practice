package drivercode;

import implementation.linkedlist.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertRec(2,0);
        linkedList.insertRec(4,1);
        linkedList.insertRec(6, 1);
        linkedList.display();
    }
}

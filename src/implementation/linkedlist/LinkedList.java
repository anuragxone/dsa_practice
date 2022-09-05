package implementation.linkedlist;

public class LinkedList {
    int size;
    Node head;
    private class Node{
        int val;
        Node next;



        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void display(){
        Node node = head;
        while(node!=null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("null");

    }

    public void insertRec(int val, int index){
        head = insertRecHelper(val, index, head);
    }
    private Node insertRecHelper(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRecHelper(val,--index, node.next);
        return node;
    }
}

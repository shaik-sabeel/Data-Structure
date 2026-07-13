
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;

        
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
        

    }

    public static void printData(){

        if(head == null){
            System.out.println("Linkedlist empty");
            return;
        }
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void addMiddle(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;

        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public static void removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head=tail= null;
            return val;

        }
        head = head.next;
        size--;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.printData();
        ll.addFirst(2);
        ll.printData();
        ll.addLast(3);
        ll.printData();
        ll.addLast(4);
        ll.printData();
        ll.addMiddle(2,8);
        ll.printData();
        ll.removeFirst();
        ll.printData();
        System.out.println(size);
    }
}

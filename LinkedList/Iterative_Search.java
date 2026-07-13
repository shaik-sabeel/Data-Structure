public class Iterative_Search{
    
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

    public static int eleSearch(int target){
        int i = 0;
        Node temp = head;
        while(temp.next != null){
            if(temp.data == target)
                return i;
            else{
                i++;
                temp = temp.next;
            }
        }

        return -1;

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

    public static void main(String[] args) {
        Iterative_Search ll = new Iterative_Search();

        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(6);
        System.out.println(size);

        
        System.out.println(ll.eleSearch(9));
        System.out.println(ll.eleSearch(4));
    }
}
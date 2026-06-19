
//class Node{
//    int data;
//    Node next;
//}
public class linked_list {
    Node head;
    //new node: /*head*/ [10 | ]->[20 | ]->[20 | null];
    //new node: [20 | null];
    void insertFirst(int value){
        Node n = new Node();//new node: [0 | null]
        n.data = value;
        n.next = head;
        head = n;
    }
    void insertLast(int value){
        if(head == null) insertFirst(value);
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node n = new Node();//new node: [0 | null]
            n.data = value;
            temp.next = n;
        }
    }
    void deleteFirst(){
        if(head == null) System.out.println("list is empty");
        else head = head.next;
    }
    void deleteLast(){
        if(head == null) System.out.println("list is empty");
        else {
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next ;
            }
            temp.next = null;
        }
    }
    public static void main(String[] args) {
        linked_list l = new linked_list();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertLast(40);
    }

}
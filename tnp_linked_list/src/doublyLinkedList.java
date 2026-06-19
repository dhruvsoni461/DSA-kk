
class Node{
    int data;
    Node next;
    Node prev;
}
public class doublyLinkedList {
    Node head;
    Node tail;
    void insertFirst(int value){
        Node n = new Node();
        n.data = value;
        n.next = head;
        n.prev = null;
        if(head!=null){
            head.prev = n;
        }
        head = n;
        if(tail == null){
            tail = n;
        }
    }
    void insertLast(int value){
        Node n = new Node();
        n.data = value;
        n.next = null;
        n.prev = tail;
        if(tail!=null){
            tail.next = n;
        }
        tail = n;
        if(head == null){
            head = n;
        }
    }
    void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    void deleteLast(){
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublyLinkedList l = new doublyLinkedList();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertLast(40);
        l.insertLast(40);
        l.insertLast(40);
        l.insertLast(40);
        l.insertLast(40);
        l.insertLast(40);
        l.insertLast(40);
        l.insertLast(40);
        l.insertLast(40);

        l.insertLast(40);
        l.insertLast(40);

        l.deleteLast();
        l.display();
    }

}
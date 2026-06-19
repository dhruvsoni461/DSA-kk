
//class Node{
//    int data;
//    Node next;
//    Node tail;
//}
public class circularLinkedList {
    Node head;
    Node tail;
    //new node: /*head*/ [10 | ]->[20 | ]->[20 | null];
    //new node: [20 | null];
    void insertFirst(int value){
        Node n = new Node();
        n.data = value;
        n.next = head;
        if(head == null){
            head = tail = n;
        }else{
            head = n;
            tail.next = head;
        }
    }
    void insertLast(int value){
        Node n = new Node();
        n.data = value;
        n.next = head;
        if(head == null){
            head = tail = n;
        }else{
            tail.next = n;
            tail = n;
        }
    }
    void deleteFirst(){
        //empty linked list
        if(head == null) System.out.println("list is empty");
        else{
            //only one element
            if(head == tail){
                head = tail = null;
            }else{//more than one element
                head = head.next;
                tail.next = head;
            }
        }
    }
    void deleteLast(){
        if(head == null) System.out.println("list is empty");
        else {
            if(head == tail) deleteFirst();
            Node temp = head;
            while(temp.next.next != head){
                temp = temp.next ;
            }
            tail = temp;
            tail.next = head;
        }
    }
    public static void main(String[] args) {
        circularLinkedList l = new circularLinkedList();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertLast(40);
    }

}
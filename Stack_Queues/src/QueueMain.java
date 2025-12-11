public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CircularQueue queue = new CircularQueue(5);
        DynamicQueue queue =  new DynamicQueue(5);
        queue.insert(5);
        queue.insert(67);
        queue.insert(55);
        queue.insert(45);

        queue.display();
        queue.insert(69);
        queue.insert(33);
        queue.insert(34);
//        System.out.println(queue.remove());
        queue.display();
    }
}

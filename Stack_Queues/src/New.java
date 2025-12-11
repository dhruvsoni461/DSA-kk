import java.util.*;

public class New {
    public static void main(String[]args){
//        Stack<Integer> stack= new Stack<>();
//        stack.push(12);
//        stack.push(1);
//        stack.push(42);
//        stack.push(62);
//        stack.push(13);
//
//        System.out.println(stack.pop());

//---------------------------------------------------------------------------//

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(6);
//        queue.add(10);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.isEmpty());

//---------------------------------------------------------------------------//

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(44);
        deque.add(33);
        deque.add(322);
        System.out.println(deque.removeLast());

    }
}

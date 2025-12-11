public class StackMain {
    public static void main(String[] args) throws StackException{
//        CustomStack stack = new CustomStack(5);
        DynamicStack stack = new DynamicStack(5);
//        CustomStack stack = new DynamicStack(5);

        stack.push(12);
        stack.push(1);
        stack.push(42);
        stack.push(62);
        stack.push(13);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

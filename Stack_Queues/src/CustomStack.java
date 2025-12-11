public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    int ptr = -1;
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Can not peek from an empty Stack!!");
        }
        return data[ptr];
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Can not pop from an empty Stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}

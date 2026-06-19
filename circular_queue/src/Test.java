public class Test{
    int[] queue;
    int size;
    int front,rear;
    Test(int size){
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }
    void enqueue(int element){
        if(front == 0 && rear == size-1 || front == rear+1) {
            System.out.println("queue is full");
        }else{
            if(front == -1){
                front = rear = 0;
            }else {
                rear = (rear+1)%size;
                queue[rear] = element;
            }
        }
    }
    void deque(){
        if(front == -1 && rear ==-1){
            System.out.println("queue is empty");
        }else{
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1) % size;
            }
        }
    }
    int poll(){
        int element;
        if(front == -1 && rear ==-1){
            element = -1;
            return element;
        }else{
            element = queue[front];
            if(front == rear){
                front = rear -1;
            }else{
                front = (front+1) % size;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        Test t1 = new Test(5);
    }
}
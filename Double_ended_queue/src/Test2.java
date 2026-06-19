public class Test2 {
    int[] queue;
    int size;
    int front,rear;
    Test2(int size){
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
    void insertRear(int element){
        if(front == 0 && rear == size-1 || front == rear+1) {
            System.out.println("queue is full");
        }else{
            if(front == -1){
                front = rear = 0;
                queue[rear] = element;
            }else if(rear == size-1){
                rear = 0;
            }else{
                rear = (rear+1)%size;
                queue[rear] = element;
            }
        }
    }
    void insertFront(int element){
        if(front == 0 && rear == size-1 || front == rear+1) {
            System.out.println("queue is full");
        }else{
            if(front == -1){
                front = rear = 0;
            }else if(front ==0){
                front = size-1;
            }else{
                front--;
                queue[front] = element;
            }
        }
    }
    void deleteRear(){
        if(front == -1 && rear ==-1){
            System.out.println("queue is empty");
        }else{
            if(front == rear){
                front = rear = -1;
            }else if (rear == 0){
                rear= size-1;
            }else{
                rear--;
            }
        }
    }
    void deleteFront(){
        if(front == -1 && rear ==-1){
            System.out.println("queue is empty");
        }else{
            if(front == rear){
                front = rear = -1;
            }else if (front == size-1){
                front = 0;
            }else{
                front++;
            }
        }
    }

    public static void main(String[] args) {
        Test2 t1 = new Test2(5);
        t1.insertFront(10);
        t1.insertFront(20);
        t1.insertRear(30);

    }
}
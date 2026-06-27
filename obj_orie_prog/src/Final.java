public class Final {
    final void show(){
        int x = 10;
        System.out.println(x);
    }
    void show2(){
        System.out.println("hey i m show 2");
    }
}
class child extends Final{
    public static void main(String[] args) {
        Final obj = new child();
        obj.show2();
    }
//    void show(){
//        int y = 1;       // cause error
//        System.out.println(y);
//    }

}

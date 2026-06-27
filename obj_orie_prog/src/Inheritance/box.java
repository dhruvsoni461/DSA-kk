package Inheritance;

//public class box {
//    int length;
//    int width;
//    int height;
//    box(){
//        this.height = 10;
//        this.length = 20;
//        this.width = 5;
//        System.out.println("box(without parameter) method called");
//    }
//
//    box(int l, int w, int h){
//        this.width = w;
//        this.length = l;
//        this.height = h;
//        System.out.println("box(with parameter) method called");
//    }
//}
//
//class boxweight extends box{
//    boxweight(){
////        super();
//        super(2,3,4 );
//    }
//
//    public static void main(String[] args) {
//        boxweight obj = new boxweight();
//    }
//}


public class box {
    void show1(){
        System.out.println("box method");
    }
}
class cube extends box{
    void show2(){
        System.out.println("cube method");
    }
    void show3(){
        System.out.println("red method");
    }
}
class red extends cube{
    void show3(){
        System.out.println("red method");
    }
}
class Main{
    public static void main(String[] args) {
        cube obj = new red();
        obj.show3();
    }
}

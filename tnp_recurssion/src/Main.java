
public class Main {
    public static void main(String[] args) {
        m2(3);
    }
    static void m1(int num){
        if(num>0){
            m1(num-1);
            System.out.println(num);

        }
        if(num>0){
            System.out.println(num);
            m1(num-1);
        }
//        if(num<0){
//            return;
//        }
//        System.out.println(num);
//        m1(num-1);
    }
    static void m2(int num){
        if(num>0){
            m2(num-1);
            m2(num-1);
            System.out.println(num);
        }
    }
}
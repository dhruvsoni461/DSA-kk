package static_keyword;

public class Main {
//    public static void main(String[] args) {
////        Human dhruv = new Human("dhruv", 21, 40000, false, "indian");
////        System.out.println(dhruv.nationality);
//    }

    static void show(){
        System.out.println("main class");
    }
}

class inherit extends Main{
    static void show() {
        System.out.println("inherited");
    }
}

class solution{
    public static void main(String[] args) {
        inherit obj = new inherit();
        obj.show();
    }
}

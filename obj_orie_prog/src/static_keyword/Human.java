package static_keyword;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static String nationality;

//    public Human(String name, int a, int salary, boolean married, String nationality) {
//        this.name = name;
//        this.age = a;
//        this.salary = salary;
//        this.married = married;
//        Human.nationality = nationality;
//    }
//
    public static void main(String[] args) {
//        Human dhruv = new Human("dhruv", 21, 40000, false, "indian");
//        Human aman = new Human("aman", 22, 40000, false, "indian");
//        System.out.println(aman.age);
        Human obj = new Human();
        obj.racer();
    }
    static void runner(){
        System.out.println("human method is running");
    }

    void racer(){
        Human.runner();
    }
}


public class Wrapper {
    public static void main(String[] args) {
        Car newcar = new Car();
        changecolor(newcar);
        System.out.println(newcar.color);
    }
    static void changecolor(Car newcolor) {
//        newcolor = new Car();
        newcolor.color = "Red";
    }
}

class Car{
    String color = "Blue";
}

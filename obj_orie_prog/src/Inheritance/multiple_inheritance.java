package Inheritance;

public class multiple_inheritance {
    void multiple_inheritance_method(){}
//    void child_method(){}
    void another_child_method(){}
}
class child extends multiple_inheritance{
    void child_method(){}
    void another_child_method(){}
}
class another_child extends child{
    void another_child_method(){}
}

class main{
    public static void main(String[] args) {
        multiple_inheritance obj = new another_child();
        
    }
}

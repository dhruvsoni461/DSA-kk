import java.util.HashMap;
import java.util.Map;

public class Super {
    int weight;
    Super(){
        super();
        this.weight = 20;
    }
}

class extended extends Super{
    int weight;
    extended(){
        this.weight = 10;
        System.out.println(this.weight);
        System.out.println(super.weight);
    }
}

class solution{
    public static void main(String[] args) {
        extended obj = new extended();
    }
}

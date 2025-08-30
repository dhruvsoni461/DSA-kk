package quest;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        // String a= "dhruv";
        // String b = "dhruv";
        // System.out.println(a==b);

        // int[] a = {1,2,3,4};
        // System.out.println(Arrays.toString(a));


        // System.out.println('a' + 'b');
       

        String str = "acba";      //false
        // String str = "abcba";      //true
        // String str = "a";      //true
       System.out.println(palindrom(str));
    }

    static boolean palindrom(String str){
        str = str.toLowerCase();

        for(int i = 0 ; i <= str.length()/2 ; i++){
            char Start = str.charAt(i);
            char End = str.charAt(str.length()-1-i);


            if (Start != End) {
                return false;
            }
        }
        return true;
    }
}

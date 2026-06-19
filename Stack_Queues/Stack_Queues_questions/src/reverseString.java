import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();

        for(char ch: arr){
            st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.pop());
        }
        System.out.println(ans.toString());
    }
}

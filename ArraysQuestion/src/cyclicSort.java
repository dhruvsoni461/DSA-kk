import java.util.Arrays;
import java.util.Scanner;

public class cyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // {3,2,5,4,1}
        }

        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
           if(arr[i] != arr[correct]){
               int temp = arr[i];
               arr[i] = arr[correct];
               arr[correct] = temp;
           }else{
               i++;
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}

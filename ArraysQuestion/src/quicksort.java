import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
//        while(true){
            System.out.println();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];

            for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

            quick_sort(nums, 0, n-1);

            for(int i = 0; i < n; i++) System.out.print(nums[i]+" ");
//        }
    }

    private static void quick_sort(int[] nums, int low, int high) {
        if(low < high){
            int pivot_index = helper(nums, low, high);
            quick_sort(nums, low, pivot_index-1);
            quick_sort(nums, pivot_index+1, high);
        }
    }

    private static int helper(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while(i < j){
            while(nums[i] <= pivot && i < high){
                i++;
            }
            while(nums[j] > pivot && j > low){
                j--;
            }
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }
}

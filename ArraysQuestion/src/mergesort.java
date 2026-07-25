import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
//        while(true){
            System.out.println();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];

            for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

            merge_sort(nums);

            for(int i = 0; i < n; i++) System.out.print(nums[i]+" ");
//        }
    }

    private static void merge_sort(int[] nums) {
        divide(nums, 0, nums.length-1);
    }

    private static void divide(int[] nums, int low, int high) {
        if(low == high) return;
        int mid = (low+high)/2;

        divide(nums, low, mid);
        divide(nums, mid+1, high);
        merge(nums, low, high, mid);
    }

    private static int[] merge(int[] nums, int low, int high, int mid) {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                list.add(nums[left++]);
            }else{
                list.add(nums[right++]);
            }
        }

        while(left <= mid){
            list.add(nums[left++]);
        }
        while(right <= high){
            list.add(nums[right++]);
        }

        int[] temp = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            nums[low + i] = list.get(i);
        }

        return temp;

    }
}

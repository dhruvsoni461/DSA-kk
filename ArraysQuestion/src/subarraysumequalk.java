public class subarraysumequalk {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 9;
        subarraysumequalk obj = new subarraysumequalk();
        System.out.println(obj.longestSubarray(nums, k));
    }
    private int longestSubarray(int[] nums, int k) {
        int sum=0;
        int left = 0;
        int max = 0;
        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            if(sum==k){
                max = Math.max(max, right-left+1);
            }else if(sum>k){
                while(sum>k && left<=right){
                    sum -= nums[left];
                    left++;
                }
            }
        }
        return max;
    }
}

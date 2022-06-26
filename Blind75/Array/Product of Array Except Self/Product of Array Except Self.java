public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int movingLeft = 0;
        int movingRight = nums.length - 1;
        int self = 0;
        int current = 1;
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int[] res = new int[nums.length];

        l[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            l[i] = l[i-1] * nums[i-1];
        }
        
        r[nums.length - 1] = 1;
        for(int i = nums.length-2; i >= 0; i--) {
            r[i] = r[i+1] * nums[i+1];
        }
        
        for(int i = 0; i < nums.length; i++) {
            res[i] = l[i] * r[i];
        }
        return res;
    }
}

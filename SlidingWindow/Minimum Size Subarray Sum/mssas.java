public class solution {
    public int minSubArrayLen(int target, int[] nums) {
      int minLength = Integer.MAX_VALUE;
      int s = 0;
      int sum = 0;
      for(int e = 0; e < nums.length; e++) {
        sum += nums[e];

        while(sum >= target) {
          sum -= nums[s];
          minLength = Math.min(minLength, e - s +1);
          s++;
        }
      }
      return s > 0 ? minLength : 0;
    }
}

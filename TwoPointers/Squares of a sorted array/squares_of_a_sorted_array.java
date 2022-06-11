class Solution {
    public int[] sortedSquares(int[] nums) {
      int[] res = new int[nums.length];
      int l = 0;
      int r = nums.length - 1;
      int index = nums.length - 1;
      while(l <= r) { //l <= to r because once you put in the second to last element, l or r will be equal to each other
        int lSquared = nums[l] * nums[l];
        int rSquared = nums[r] * nums[r];
        if(lSquared > rSquared) {
          nums[index--] = lSquared;
          l++;
        } else {
          nums[index--] = rSquared;
          r--;
        }
      }
      return res;
    }
}

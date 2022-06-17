class Solution {
  public void findAndSwapPositive(int i, int[] nums){

  }
  public void findAndSwapNegative(int i, int[] nums){

  }

    public int[] rearrangeArray(int[] nums) {
      int[] n = new int[nums.length];

      int indexPos = 0;
      int indexNeg = 1;

      for(int i = 0; i < nums.length; i++) {
        if(nums[i] >= 0) {
          n[indexPos] = nums[i];
          indexPos+=2;
        } else {
          n[indexNeg] = nums[i];
          indexNeg+=2;
        }
      }
      return n;
    }
}

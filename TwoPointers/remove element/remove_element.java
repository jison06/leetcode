class Solution {
  public int removeElement(int[] nums, int val) {
    if(nums.length == 0) return 0;
    int l = 0;
    // we want r = 0 because we need to check if the first element == val
    for(int r = 0; r < nums.length; r++) {
      if(nums[r] != val) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l++] = temp;
      }
    }

    return l;
  }
}

public class move_zeroes {
  public void moveZeroes(int[] nums) {
    int l = 0;
    int r = 1;
    while(r < nums.length) {
      if(nums[l] != 0) {
          l++;
          r++;
      } else if(nums[r] == 0) {
          r++;
      } else {
          int temp = nums[r];
          nums[r] = nums[l];
          nums[l] = temp;
      }
    }
  }
}

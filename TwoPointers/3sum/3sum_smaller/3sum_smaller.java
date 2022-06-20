public class 3sum_smaller {
  public int threeSumSmaller(int[] nums, int target){
    if(nums.length < 3) return 0;

    int count = 0;
    Arrays.sort(nums);
    for(int i = 0; i < nums.length; i++){
      int l = i+1;
      int r = nums.length - 1;
      while(l < r) {
        int sum = nums[i] + nums[l] + nums[r];
        if(sum < target) {
          count += r - l;
          l++;
        } else {
          r--;
        }
      }
    }
    return count;
  }
}

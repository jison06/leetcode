class Solution {
  public int threeSumClosest(int[] nums, int target) {
    if(nums.length == 3) return nums[0] + nums[1] + nums[2];

    //closest keeps track of the current min distance
    int closest = Integer.MAX_VALUE;
    int ans = 0;
    Arrays.sort(nums);
    for(int i = 0; i < nums.length; i++) {
      // if the curr num == prev num, the distances will be the same, next iteration
      if(i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int l = i+1;
      int r = nums.length - 1;

      while(l < r) {
        int sum = nums[i] + nums[l] + nums[r];
        int distance = Math.abs(target - sum);

        //the closer the sum is to the target, the less distance there is from sum to target
        if(sum < target) {
          l++;
        } else if (sum > target) {
          r--;
        } else {
          return sum;
        }

        if(distance < closest) {
          closest = distance;
          ans = sum;
        }
      }
    }
    return ans;
  }
}

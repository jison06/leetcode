class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new LinkedList<>();
    if(nums.length <= 2) return list;
    Arrays.sort(nums);
    for(int i = 0; i < nums.length; i++) {
      if(i > 0 && nums[i] == nums[i - 1]) { // we don't want to repeat combinations
        continue;
      }
      int l = i+1;
      int r = nums.length - 1;
      while(l < r) {
        int sum = nums[i] + nums[l] + nums[r];
        if(sum < 0) {
          l++;
        } else if(sum > 0) {
          r--;
        } else {
          List<Integer> subList = new LinkedList<Integer>();
          subList.add(nums[i]);
          subList.add(nums[l]);
          subList.add(nums[r]);
          list.add(subList);

          //increment the pointers then ensure that the pointers point to elements that haven't been seen before
          l++;
          r--;
          // Makes sure that there isn't a duplicate list in the result
          while(l < r && nums[l] == nums[l - 1]) {
            l++;
          }

          // Makes sure that there isn't a duplicate list in the result
          while(l < r && nums[r] == nums[r + 1]) {
            r--;
          }
        }
      }
    }
    return list;
  }
}

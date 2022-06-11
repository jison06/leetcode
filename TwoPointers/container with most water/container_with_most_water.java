public class container_with_most_water {
  // We need an int to keep track of max area
  // area_container(r, l) = min(height(r), height(l)) * (r-l)
  public int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    int l = 0;
    int r = height.length - 1;

    while(l < r) {
      max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
      if(height[l] <= height[r]) {
        l++;
      } else {
        r--;
      }
    }

    return max;
  }
}

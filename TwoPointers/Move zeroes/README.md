# [Move Zeroes](https://leetcode.com/problems/move-zeroes/)

## Problem
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



```java
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
```

## Takeaways
- You can start the two pointers next to each other
- You can use the left pointer as an ""anchor"" to remember a spot
  - This is useful for in place, relative-order swapping
- You can use the right pointer to find the element to swap the left with
- If you have an anchor and the problem allows it, you can move the right pointer to find the element to swap with, without using a double loop
- You can use the right pointer going past the array boundaries as an exit condition"

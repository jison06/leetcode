# [3sum smaller](https://leetcode.com/problems/3sum-smaller/)

## Problem
Given an array of n integers nums and an integer target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.


```java
Example 1:

Input: nums = [-2,0,1,3], target = 2
Output: 2
Explanation: Because there are two triplets which sums are less than 2:
[-2,0,1]
[-2,0,3]
Example 2:

Input: nums = [], target = 0
Output: 0
Example 3:

Input: nums = [0], target = 0
Output: 0


Constraints:

n == nums.length
0 <= n <= 3500
-100 <= nums[i] <= 100
-100 <= target <= 100
```

## Takeaways
- You can use the difference between right and left to get you pairs that would be difficult to express with just moving the left and/or the right pointers
- For example, given: `[-2, 0, 1, 3]`, if your target `4`, and `i = 0, l = 1, r = 3`, you know that the pair `[-2, 0, 3]` work but you can also infer that `[-2,0,1]` work as well because moving the right one will make the sum smaller, thus you don't have to move any pointers, you can just get the difference between the left and the right as the number of pairs
- That way, you won't miss any pairs by moving the right pointer

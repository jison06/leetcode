# [3sum](https://leetcode.com/problems/3sum)

## Problem

```java
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
```

## Takeaways
- Sorting makes everything easier
  - Made this problem into two sum based on the position of i
- It's ok to use Arrays.sort(nlogn)
- You can use a loop to loop through all the elements and have a two pointer problem with the sub arrays of i+1 to array.length - 1
  - This is an effective way of going from n^3 to n^2
- In a sorted list and you don't want to repeat combinations, when you find a combination you can increment/decrement both pointers and then use while loops for each one to look for new combinations by
  - l++ and r++ Then
  - Checking l == l -1
  - Checking r == r + 1

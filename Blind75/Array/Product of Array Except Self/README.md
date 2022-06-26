# [Product Of Array Except Self] (https://leetcode.com/problems/product-of-array-except-self/)

## Problem
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 
```
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
```

## Takeaways
- **You can use multiple loops that aren't nested to satisfy a runtime requirement**
- You can build multiple arrays that store solutions
- In this problem, you build two arrays, left and right which hold the solutions of the products of the elements before, after, but not equal to self

# [Squares of a sorted array](https://leetcode.com/problems/squares-of-a-sorted-array)

## Problem
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 
```java
Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
```
## Takeaways
- You can start both the pointers in the middle if the array is sorted and move the pointers outwards
- When you create an array you don't have to start inserting elements only to the start and move from left to right. You can move from right to left
  - This is especially useful if you're given a sorted integer array and you want to create a new sorted array because you can guarantee that the right side contains the largest elements and you can move the left or the right pointer accordingly
  - This helps you deal with negative values w/o abs

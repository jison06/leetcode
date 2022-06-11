# [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/)

## Problem
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

Example 1:

```java
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
```

## Takeaways
- How to declare an array inline(Anonymous array)
  - `new type[] { i, j, k }`
- Sorted array and finding a target with it
  - You can declare two pointers: slow and fast
  - Since the array is sorted you can make binary decisions based on whether the sum is less than or greater than the target
    Ex: start + end < target, start++ because the only way to make the sum larger is to increment the start because the array is sorted
  - If you have 3 cases, <, >, or == and you can make binary  decision based on it, consider making the equal case the loop stop condition
  - If you don't want to repeat an element, you could also have the stopping condition being the right pointer is less than the left pointer

# [ Longest substring without repeating chars ]( https://leetcode.com/problems/longest-substring-without-repeating-characters )

## Problem
Given a string s, find the length of the longest substring without repeating characters.



```java
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
```

## Takeaways
- You can store elements in an array of size[128] to keep track of how many occurences of each element has occured. You can also use a map
- in this problem since we're storing it immediately, you know that the first element at index start is the first duplicate, and we can move the window once you've subtracted start from the string

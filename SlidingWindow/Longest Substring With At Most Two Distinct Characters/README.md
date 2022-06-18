# [Longest Substring with at most 2 distinct characters](https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/)

## Problem
Given a string s, return the length of the longest substring that contains at most two distinct characters.



```java
Example 1:

Input: s = "eceba"
Output: 3
Explanation: The substring is "ece" which its length is 3.
Example 2:

Input: s = "ccaabbb"
Output: 5
Explanation: The substring is "aabbb" which its length is 5.


Constraints:

1 <= s.length <= 105
s consists of English letters.
```

## Takeaways
- I used a hashmap instead of an array because it has dynamic length and the `.size` method. If I used an array like with the longest substring w/o repeating characters, the array length would have been the size allocated. With this approach, I could leverage the `.size` method as my condition for the while loop that shrinks the window

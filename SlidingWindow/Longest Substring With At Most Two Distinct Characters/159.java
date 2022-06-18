class Solution {
  public int lengthOfLongestSubstringTwoDistinct(String s) {
    if(s.length() < 3) return s.length();
    HashMap<Character, Integer> h = new HashMap<>();
    int start = 0;
    int end = 0;
    int max = Integer.MIN_VALUE;
    while(end < s.length()) {
      char c = s.charAt(end);
      h.put(c, h.getOrDefault(c, 0)+1);
      while(h.size() > 2) {
        char cs = s.charAt(start++);
        if(h.get(cs) == 1) {
          h.remove(cs);
        } else {
          h.put(cs, h.get(cs) - 1);
        }
      }

      max = Math.max(max, end - start + 1);
      end++;
    }
    return max;
  }
}

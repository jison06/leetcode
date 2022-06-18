import java.util.HashMap;
public class longest_substring_wo_repeating_chars {
  public int lengthOfLongestSubstring(String s) {
    if(s.length() == 0) return 0;

    char[] ca = new char[128];
    int longest = Integer.MIN_VALUE;
    int start = 0;
    int end = 0;
    while(end < s.length()) {
      char c = s.charAt(end);
      ca[c]++;
      while(ca[c] > 1) {
        char cs = s.charAt(start++);
        ca[cs]--;
      }

      longest = Math.max(longest, end - start+1);
      end++;
    }
    return longest;
  }
}

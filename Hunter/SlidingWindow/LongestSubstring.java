package com.company.Hunter.SlidingWindow;
import java.util.HashSet;
import java.util.Set;
import com.company.HastSet;

//longest substring without repeating characters.
//s = "abcabcbb"
//Answer: 3
//        (substring = "abc")
//P
public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // duplicate mila → left se remove
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen); // Output: 3
    }
}

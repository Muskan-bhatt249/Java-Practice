import java.util.*;

class Solution {
    public int SubString(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();

        
        if (n == 0) return 0;

        
        for (int i = 0; i <= m - n; i++) {
            String subStr = haystack.substring(i, i + n); 
            if (needle.equals(subStr)) {
                return i;
            }
        }

        
        return -1;
    }
}

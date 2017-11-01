5. Longest Palindromic Substring

class Solution {
    public String longestPalindrome(String s) {
        if(s.equals("") || s == null) return "";
        String ans = s.substring(0,1);
        int len = s.length(),maxLen = 1,start = 0,end = 0;
        boolean[][] dp = new boolean[len][len];
        for(int i = 0;i<=len-1;i++) {
            dp[i][i] = true;
            if(i <= len-2 && s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                start = i;
                end = i+1;
                maxLen = 2;
            }
        }
        for(int i = 0;i<=len-1;i++){
            for(int j = i-2;j>=0;j--){
                if(s.charAt(i) == s.charAt(j) && dp[j+1][i-1]) {
                    dp[j][i] = true;
                    if(i-j+1 > maxLen){
                        start = j;
                        end = i;
                        maxLen = i-j+1;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
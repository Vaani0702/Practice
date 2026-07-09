class Solution {

    public boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public String longestPalindrome(String s) {

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                if (isPalindrome(s, i, j)) {

                    if (j - i + 1 > res.length()) {
                        res = s.substring(i, j + 1);
                    }

                }
            }
        }

        return res;
    }
}
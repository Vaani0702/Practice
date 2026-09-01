class Solution {
    public int romanToInt(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int cur = 0;
            int nxt = 0;

            if (s.charAt(i) == 'I')
                cur = 1;
            else if (s.charAt(i) == 'V')
                cur = 5;
            else if (s.charAt(i) == 'X')
                cur = 10;
            else if (s.charAt(i) == 'L')
                cur = 50;
            else if (s.charAt(i) == 'C')
                cur = 100;
            else if (s.charAt(i) == 'D')
                cur = 500;
            else
                cur = 1000;

            if (i + 1 < s.length()) {

                if (s.charAt(i + 1) == 'I')
                    nxt = 1;
                else if (s.charAt(i + 1) == 'V')
                    nxt = 5;
                else if (s.charAt(i + 1) == 'X')
                    nxt = 10;
                else if (s.charAt(i + 1) == 'L')
                    nxt = 50;
                else if (s.charAt(i + 1) == 'C')
                    nxt = 100;
                else if (s.charAt(i + 1) == 'D')
                    nxt = 500;
                else
                    nxt = 1000;
            }

            if (cur < nxt)
                ans -= cur;
            else
                ans += cur;
        }

        return ans;
    }
}
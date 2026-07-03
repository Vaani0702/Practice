class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int left = 0; left < s.length(); left++) {

            boolean[] visited = new boolean[128];

            for (int right = left; right < s.length(); right++) {

                char ch = s.charAt(right);

                if (visited[ch]) {
                    break;
                }

                visited[ch] = true;
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
}
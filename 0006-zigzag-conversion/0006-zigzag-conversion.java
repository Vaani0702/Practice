class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        String[] rows = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int currentRow = 0;
        boolean down = true;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            rows[currentRow] = rows[currentRow] + ch;

            if (currentRow == numRows - 1) {
                down = false;
            }

            else if (currentRow == 0) {
                down = true;
            }

            if (down) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        String ans = "";

        for (int i = 0; i < numRows; i++) {
            ans = ans + rows[i];
        }

        return ans;
    }
}
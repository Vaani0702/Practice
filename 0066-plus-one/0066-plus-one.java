class Solution {
    public int[] plusOne(int[] digits) {
        boolean allNines = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                allNines = false;
                break;
            }
        }

        if (allNines) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1; 
            return newDigits;
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[digits.length - 1] == 9) {
                int idx = digits.length - 1;
                while (idx >= 0 && digits[idx] == 9) {
                    digits[idx] = 0;
                    idx--;
                }
                digits[idx] = digits[idx] + 1;
                return digits;
            } else {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
                return digits;
            }
        }
        return digits;
    }
}

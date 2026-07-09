class Solution {
    public String longestPalindrome(String s) {
        String res= "";
        for(int i =0; i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int left= i;
                int right=j;
                boolean isp= true;
                while(left<right){
                    if(s.charAt(left)!= s.charAt(right)){
                        isp= false;
                        break;
                    }
                    left++;
                    right--;

                }
            
                if (isp == true) {
                    if ((j - i + 1) > res.length()) {
                          res = s.substring(i, j + 1);
                            }
                            }
            }

        }
        return res;
    }
}
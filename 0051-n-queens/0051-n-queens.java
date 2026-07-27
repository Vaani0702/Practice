class Solution {
    List<List<String>> result=new ArrayList<>();
    int[][] board;
    boolean isSafe(int n,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]==1)return false;
        }
        for(int i=1;row-i>=0&&col-i>=0;i++){
            if(board[row-i][col-i]==1)return false;
        }
        for(int i=1;row-i>=0&&col+i<n;i++){
            if(board[row-i][col+i]==1)return false;
        }
        return true;

    }
    void helper(int n,int row){
        if(row==n){
            List<String> ls=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){
                    if(board[i][j]==0){
                        sb.append(".");
                    }
                    else{
                        sb.append("Q");
                    }
                
                }
                ls.add(sb.toString());
            }
            result.add(ls);
            return ;
        }
        for(int col=0;col<n;col++){
            if(!isSafe(n,row,col)){
                continue;
            }
            board[row][col]=1;
            helper(n,row+1);
            board[row][col]=0;

        }

    }
    public List<List<String>> solveNQueens(int n) {
        board=new int[n][n];
        helper(n,0);
        return result;

        
    }
}
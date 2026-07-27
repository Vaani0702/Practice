class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][]row=new boolean[9][9];
        boolean [][]col=new boolean[9][9];
        boolean [][]box=new boolean[9][9];
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                int num=board[r][c]-'1';
                int b=(r/3)*3+(c/3);
                if(row[r][num] || col[num][c] || box[b][num]){
                    return false;
                }
                row[r][num]=true;
                col[num][c]=true;
                box[b][num]=true;
            }
        }
        return true ;
    }
}
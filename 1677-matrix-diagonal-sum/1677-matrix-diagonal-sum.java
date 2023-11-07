class Solution {
    public int diagonalSum(int[][] mat) {
        int s1=0;
        int s2=0;
        int n = mat.length;
        int m =0;
        for(int i=0;i<mat.length;i++){
            s1 += mat[i][i];
            s2 += mat[i][n-1-i];
        }
        if(n%2!=0){
           m= s1+s2-mat[n/2][n/2];
        }
        else{
         m=s1+s2;
        }
        return m;
    }
}
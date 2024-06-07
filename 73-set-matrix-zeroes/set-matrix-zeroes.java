class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> m=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    m.add(i);
                    n.add(j);  
                }   
            }
        }
        zero(matrix, m ,n);


    }
    public void zero(int[][] matrix, ArrayList<Integer> m, ArrayList<Integer> n){
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < m.size(); i++) {
            for (int j = 0; j < col; j++) {
                matrix[m.get(i)][j] = 0;
            }
        }
      
        for (int i = 0; i < n.size(); i++) {
            for (int j = 0; j < row; j++) {
                matrix[j][n.get(i)] = 0;
            }
        }
    }
}
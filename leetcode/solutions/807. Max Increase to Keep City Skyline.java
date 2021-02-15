class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
       int result=0;
        int n=grid.length;
        int[] max_row_vals=new int[n];
        int[] max_column_vals=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                max_row_vals[i]=Math.max(max_row_vals[i],grid[i][j]);
                max_column_vals[j]=Math.max(max_column_vals[j],grid[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            result+=Math.min(max_row_vals[i],max_column_vals[j])-grid[i][j];    
            }
        }
        return result;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)return false;
        
        int rows=matrix.length;
        int column=matrix[0].length;
        
        int left=0;
        int right=rows*column-1;
        while(left<=right){
            int midpoint=left+(right-left)/2;
            int midpoint_element=matrix[midpoint/column][midpoint%column];
            if(target==midpoint_element){
                return true;
            }else if(target<midpoint_element){
                right=midpoint-1;
            }else if(target>midpoint_element){
                left=midpoint+1;
            }
        }
        return false;
    }
}

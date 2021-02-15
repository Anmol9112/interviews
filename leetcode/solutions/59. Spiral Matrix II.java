class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int rowBegin=0;
        int rowEnd=n-1;
        int columnBegin=0;
        int columnEnd=n-1;
        int counter=1;
        while(rowBegin<=rowEnd && columnBegin<=columnEnd){
            for(int i=columnBegin;i<=columnEnd;i++){
                res[rowBegin][i]=counter++;
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                res[i][columnEnd]=counter++;
            }
            columnEnd--;
            if(rowBegin<=rowEnd){
                for(int i=columnEnd;i>=columnBegin;i--){
                    res[rowEnd][i]=counter++;
                }
            }
            rowEnd--;
            if(columnBegin<=columnEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    res[i][columnBegin]=counter++;
                }
            }
            columnBegin++;
        }
        return res;
    }
}

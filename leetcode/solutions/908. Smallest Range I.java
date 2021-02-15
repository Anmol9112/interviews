class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min_value=A[0];
        int max_value=A[0];
        for(int i=0;i<A.length;i++){
            min_value=Math.min(min_value,A[i]);
            max_value=Math.max(max_value,A[i]);
        }
        if(min_value+K >= max_value-K){
            return 0;
        }else{
            return (max_value-K)-(min_value+K);
        }
    }
}

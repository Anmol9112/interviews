class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1])decreasing=false;
            if(A[i]>A[i+1])increasing=false;
        }
        return increasing || decreasing;
    }
}

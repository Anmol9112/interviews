class Solution {
    public int[] sortedSquares(int[] A) {
        int N=A.length;
        int positive=0;
        while(positive<N && A[positive]<0){
            positive+=1;
        }
        int negative=positive-1;
        int[] sorted_squares=new int[N];
        int counter=0;
        while(negative>=0 && positive<N){
            if(A[negative]*A[negative]<A[positive]*A[positive]){
                sorted_squares[counter]=A[negative]*A[negative];
                negative-=1;
        }else{
            sorted_squares[counter]=A[positive]*A[positive];
            positive+=1;
        }
        counter+=1;
    }
    while(negative>=0){
        sorted_squares[counter]=A[negative]*A[negative];
                negative-=1;
        counter+=1;
    }
    while(positive<N){
        sorted_squares[counter]=A[positive]*A[positive];
            positive+=1;
        counter+=1;
    }
    return sorted_squares;
}}

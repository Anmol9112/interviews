class Solution {
    public int oddEvenJumps(int[] A) {
        int good_starting_index_count=1;
        int n=A.length;
        
        boolean[] higher=new boolean[n];
          boolean[] lower=new boolean[n];
        
        higher[n-1]=true;
        lower[n-1]=true;
        
        TreeMap<Integer,Integer> treeMap=new TreeMap();
        treeMap.put(A[n-1],n-1);
        
        for(int i=n-2;i>=0;i--){
        Map.Entry higher_key_value_pair=treeMap.ceilingEntry(A[i]);
        Map.Entry lower_key_value_pair=treeMap.floorEntry(A[i]);
        
        if(higher_key_value_pair!=null){
            higher[i]=lower[(int)higher_key_value_pair.getValue()];
        }
        if(lower_key_value_pair!=null){
            lower[i]=higher[(int)lower_key_value_pair.getValue()];
        }
        if(higher[i]){
            good_starting_index_count++;
        }
        treeMap.put(A[i],i);
    }
    return good_starting_index_count;
}}

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> num_occurences=new HashMap();
        for(int num:arr){
            num_occurences.put(num,num_occurences.getOrDefault(num,0)+1); 
        }
        HashSet<Integer> unique_vals=new HashSet(num_occurences.values());
        return num_occurences.size()==unique_vals.size();
    }
}

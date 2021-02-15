class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> repeatedSubsequences=new ArrayList<>();
        Map<String,Integer> seen=new HashMap<>();
        int i=0;
        while(i+10<=s.length()){
            String subsequence=s.substring(i,i++ + 10);
            seen.put(subsequence, seen.getOrDefault(subsequence,0)+1);
            if(seen.get(subsequence)==2){
              repeatedSubsequences.add(subsequence);  
            }
        }
        return repeatedSubsequences;
    }
}

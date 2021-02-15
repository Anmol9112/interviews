class Solution {
    public int characterReplacement(String s, int k) {
        int N=s.length();
        int[] char_count=new int[26];
        int window_start=0;
        int max_length=0;
        int max_count=0;
         for(int window_end=0;window_end<N;window_end++){
             char_count[s.charAt(window_end)-'A']++;
             int current_char_counts= char_count[s.charAt(window_end)-'A'];
             max_count=Math.max(max_count,current_char_counts);
         
        while(window_end-window_start-max_count+1>k){
            char_count[s.charAt(window_start)-'A']--;
            window_start++;
        }
        max_length=Math.max(max_length,window_end-window_start+1);
    }
    return max_length;
}}

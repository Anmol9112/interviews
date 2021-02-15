class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> banned_words=new HashSet();
        HashMap<String,Integer> valid_words_count=new HashMap();
        for(String banned_word: banned){
            banned_words.add(banned_word);
        }
        String[] words=paragraph.toLowerCase().split("\\W+");
        for(String word:words){
            if(!banned_words.contains(word)){
              valid_words_count.put(word,valid_words_count.getOrDefault(word,0)+1);  
            }
        }
        int max=0;
        String result="";
        for(String word:valid_words_count.keySet()){
            if(valid_words_count.get(word)>max){
                max=valid_words_count.get(word);
                result=word;
            }
        }
        return result;
    }
}

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       HashSet<String> unique_words=new HashSet();
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        for(String word:words){
            StringBuilder transformation=new StringBuilder();
            for(char c:word.toCharArray()){
                transformation.append(MORSE[c-'a']);
            }
            unique_words.add(transformation.toString());
        }
        
        return unique_words.size();
    }
}

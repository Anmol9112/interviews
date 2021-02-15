class Solution {
    public String toGoatLatin(String S) {
        HashSet<Character> vowels=new HashSet();
        for(char c: "aeiouAEIOU".toCharArray()){
            vowels.add(c);
        }
        String result="";
        int index=1;
        for(String word:S.split("\\s")){
            if(index>1){
                result+=" ";
            }
            char first_letter=word.charAt(0);
            if(vowels.contains(first_letter)){
                result+=word+"ma";
            }else{
                result+=word.substring(1)+first_letter+"ma";
            }
            for(int j=0;j<index;j++){
                result+="a";
            }
            index+=1;
        }
        return result;
    }
}

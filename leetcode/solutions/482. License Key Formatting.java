class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder result=new StringBuilder();
        int count=0;
        int i=S.length()-1;
        while(i>=0){
            char current=Character.toUpperCase(S.charAt(i));
            if(current=='-'){
                i--;
            }else if(count!=0 && count%K ==0){
                result.insert(0,'-');
                count=0;
            }else{
                result.insert(0,current);
                count++;
                i--;
            }
        }
        return result.toString();
    }
}

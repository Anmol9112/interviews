class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length<1){
            return new ArrayList<String>();
        }
        List<String> result=new ArrayList<String>();
        int start=nums[0];
        int previous=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-previous>1||nums[i]-previous<1){
                if(start!=previous){
                    result.add(start+"->"+previous);
                }else{
                    result.add(""+start);
                }
                start=nums[i];
                previous=nums[i];
            }
            if(nums[i]-previous==1){
                previous=nums[i];
            }
        }
        if(previous!=start){
            result.add(new String(start+"->"+previous));
        }else{
            result.add(new String(""+start));
        }
        return result;
    }
}

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int result=Integer.MAX_VALUE;
        int left=0;
        int sum_val=0;
        for(int i=0;i<nums.length;i++){
            sum_val+=nums[i];
            while(sum_val>=s){
                result=Math.min(result,i+1-left);
                sum_val-=nums[left];
                left++;
            }
        }
        return (result!=Integer.MAX_VALUE)?result:0;
    }
}

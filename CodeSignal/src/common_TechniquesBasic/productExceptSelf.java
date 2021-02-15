int productExceptSelf(int[] nums, int m) {
int sum=0;
int product=1;
for(int i=0;i<nums.length;i++){
    sum = nums[i]*sum+product;
    sum%=m;
    product*=nums[i];
    product%=m;
}
return sum;
}

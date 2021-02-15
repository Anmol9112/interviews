class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> self_dividing_nums=new ArrayList();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)) self_dividing_nums.add(i);
        }
        return self_dividing_nums;
    }
    public boolean isSelfDividing(int num){
        for(char c:String.valueOf(num).toCharArray()){
            if(c=='0' || num%(c-'0')>0){
                return false;
            }
        } 
        return true;
    }
}

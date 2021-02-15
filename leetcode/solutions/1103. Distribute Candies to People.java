class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] output_arr=new int[num_people];
        int i=0;
        int loops=0;
        while(candies>0){
            if(i==num_people){
                i=0;
                loops++;
            }
            int current_candy=(loops*num_people)+(i+1);
            if(candies-current_candy<0){
                output_arr[i]+=candies;
            }else{
                output_arr[i]+=current_candy;
            }
            i++;
            candies-=current_candy;
        }
        return output_arr;
        }
}

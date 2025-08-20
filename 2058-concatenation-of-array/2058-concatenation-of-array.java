class Solution {
    public int[] getConcatenation(int[] nums) {
        int result[]=new int[2*nums.length];
        int in=0;
        for(int i=0;i<nums.length;i++){
            result[in]=nums[i];
            result[in+nums.length]=nums[i]; 
             in++;
    }
    return result;
    }
}
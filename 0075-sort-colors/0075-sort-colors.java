class Solution {
    public void sortColors(int[] nums) {
    int t=nums.length-1;
    int i=0;
    int z=0;
    while(i<=t){
        if(nums[i]==2)
        {
            swap(nums,i,t);
            t--;
        }
        else{
            if(nums[i]==0)
            {
                swap(nums,i,z);
                z++;
            }
            i++;
        }
    }
}
public static void swap(int nums[],int i,int j){
    int t=nums[i];
    nums[i]=nums[j];
    nums[j]=t;
}
}
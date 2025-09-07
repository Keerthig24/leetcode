class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m-1;
        int b=n-1;
        int in = nums1.length-1;
        while(a>=0&&b>=0){
            if(nums1[a]>=nums2[b])
            {
                nums1[in]=nums1[a];
                a--;
            }
            else{
                nums1[in]=nums2[b];
                b--;
            }
            in--;
        }
        while(b>=0)
        {
            nums1[in]=nums2[b];
            b--;
            in--;
        }


    }
}
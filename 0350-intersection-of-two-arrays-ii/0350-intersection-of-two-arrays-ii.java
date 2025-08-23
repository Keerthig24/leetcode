class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a=0,b=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(a<nums1.length&&b<nums2.length){
            if(nums1[a]==nums2[b]){
             list.add(nums1[a]);
             a++;
             b++;
        }
        else if(nums1[a]<nums2[b])
        {
            a++;
        }
        else{
            b++;
        }
    }
        int r[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            r[i]=list.get(i);
        }
        return r;
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int a=0;
        int b=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> s = new ArrayList<>();
        while(a<nums1.length&&b<nums2.length){
            if(nums1[a]==nums2[b]){
                s.add(nums1[a]);
                a++;
                b++;
            }
            else if(nums1[a]<nums2[b]){
                a++;
            }
            else{
                b++;
            }
        }

        int r[]=new int[s.size()];
        for(int i=0;i<s.size();i++){
          r[i]=  s.get(i);
        }
        return r;
    }
}
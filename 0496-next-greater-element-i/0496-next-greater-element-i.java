class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       // import java.util.*;


        Map<Integer, Integer> next = new HashMap<>();
        Deque<Integer> st = new ArrayDeque<>();
        for (int n : nums2) {
            while (!st.isEmpty() && st.peek() < n) next.put(st.pop(), n);
            st.push(n);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) ans[i] = next.getOrDefault(nums1[i], -1);
        return ans;
    
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        int[] count = new int[s.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
            int idx = sb.length() - 1;
            if (idx == 0 || sb.charAt(idx) != sb.charAt(idx - 1)) {
                count[idx] = 1;
            } else {
                count[idx] = count[idx - 1] + 1;
                if (count[idx] == k) {
                    sb.delete(sb.length() - k, sb.length());
                }
            }
        }
        return sb.toString();
    }
}

class Solution {
    public int compress(char[] chars) {
        
        int n = chars.length, write = 0, read = 0;
        while (read < n) {
            char c = chars[read];
            int start = read;
            while (read < n && chars[read] == c) read++;
            int count = read - start;
            chars[write++] = c;
            if (count > 1) {
                String s = Integer.toString(count);
                for (int i = 0; i < s.length(); i++) chars[write++] = s.charAt(i);
            }
        }
        return write;
    }
}

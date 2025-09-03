class Solution {
    public List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        boolean inBlock = false;
        StringBuilder newline = new StringBuilder();
        for (String line : source) {
            int i = 0;
            if (!inBlock) newline = new StringBuilder();
            while (i < line.length()) {
                if (!inBlock && i + 1 < line.length() && line.charAt(i) == '/' && line.charAt(i + 1) == '*') {
                    inBlock = true;
                    i += 2;
                } else if (inBlock && i + 1 < line.length() && line.charAt(i) == '*' && line.charAt(i + 1) == '/') {
                    inBlock = false;
                    i += 2;
                } else if (!inBlock && i + 1 < line.length() && line.charAt(i) == '/' && line.charAt(i + 1) == '/') {
                    break;
                } else if (!inBlock) {
                    newline.append(line.charAt(i));
                    i++;
                } else {
                    i++;
                }
            }
            if (!inBlock && newline.length() > 0) {
                result.add(newline.toString());
            }
        }
        return result;
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        String r[]=s.split(" ");
        for(int i=r.length-1;i>=0;i-- ){
            if(!r[i].isEmpty()){
                return r[i].length();
            }
        }
            return 0;
        }
    }

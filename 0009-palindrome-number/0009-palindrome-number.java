class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int s=0;
        while(x>0){
            int n=x%10;
            s=s*10+n;
            x=x/10;
        }
        if(s!=t){
            return false;
        }
        return true;
    }
}
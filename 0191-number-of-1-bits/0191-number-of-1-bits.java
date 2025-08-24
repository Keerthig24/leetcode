class Solution {
    public int hammingWeight(int n) {
        int d=0;
        while(n>0){
        int s = n%2;
        d=s+d;
        n=n/2;
        }
        return d;
    }
}
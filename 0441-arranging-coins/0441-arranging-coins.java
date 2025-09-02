class Solution {
    public int arrangeCoins(int n) {
        long l=0;
        long r=n;
        while(l<=r)
{
    long mid = l+(r-l)/2;
    long c =mid*(mid+1)/2;
    if(c==n){
        return (int)mid;
    }
    else if(c<n){
        l=mid+1;
    }
    else{
        r=mid-1;
    }
} 
return (int)r;       
    }
}
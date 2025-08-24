class Solution {
    public boolean isHappy(int n) {
        int s=0;
        HashSet<Integer> se =new HashSet<>();
           while(n!=1 && !se.contains(n)){
            se.add(n);
            while(n!=0){
               int d=n%10;
               s=s+d*d;
              n=n/10;
            }
            n=s;
            s=0;
    }
    if(n==1)
    {
        return true;
    }
      return false;  
    }
}
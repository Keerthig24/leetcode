class RecentCounter {
      Queue<Integer> st;
    public RecentCounter() {
        st = new LinkedList<>();
    }
    
    public int ping(int t) {
        st.offer(t);
        while(st.peek()<t-3000){
        st.poll();
        }
        return st.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
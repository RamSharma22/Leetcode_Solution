class Solution {
    public boolean uniformArray(int[] n) {
        int m = n[0], o = 0;
        for(int x : n){
            m = Math.min(m,x);
            o |= x & 1;
        }
        return (m & 1) == o;
    }
}
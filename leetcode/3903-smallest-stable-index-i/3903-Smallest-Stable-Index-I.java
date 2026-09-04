class Solution {
    public int firstStableIndex(int[] n, int k) {
        int l = n.length;
        int[] s = new int[l];
        int mn = Integer.MAX_VALUE;

        for(int i = l-1;i >= 0;i--){
            mn = Math.min(mn,n[i]);
            s[i] = mn;
        }

        int mx = 0;
        for(int i = 0;i < l;i++){
            mx = Math.max(mx,n[i]);
            int sc = mx - s[i];
            if(sc <= k){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int firstStableIndex(int[] n, int k) {
        int l = n.length;
        int[] s = new int[l];
        int mn = Integer.MAX_VALUE;
        for(int i = l-1;i >= 0;i--){
            mn = Math.min(mn,n[i]);
            s[i] = mn;
        }
        int mx = Integer.MIN_VALUE;
        for(int i = 0;i < l;i++){
            mx = Math.max(mx,n[i]);
            int r = mx-s[i];
            if(r <= k){
                return i;
            }
        }
        return -1;
    }
}
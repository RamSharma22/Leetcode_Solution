class Solution {
    public int maxSubArray(int[] n) {
        int m = n.length;
        int mx = n[0];
        int s = n[0];
        for(int i = 1;i < m;i++){
            if(s < 0){
                s = 0;
            }
            s += n[i];
            mx = Math.max(mx, s);
        }
        return mx;
    }
}
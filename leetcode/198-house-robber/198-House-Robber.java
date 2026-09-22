class Solution {
    public int rob(int[] n) {
        int l = n.length;
        int[] dp = new int[l];
        if(l == 1){
            return n[0];
        }
        dp[0] = n[0];
        dp[1] = Math.max(n[0],n[1]);
        for(int i = 2;i < l;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+n[i]);
        }
        return dp[l-1];
    }
}
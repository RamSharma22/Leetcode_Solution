class Solution {
    public int largestInteger(int[] n, int k) {
        int m = n.length;
        if(k == m){
            int ans = 0;
            for(int x : n){
                ans = Math.max(ans,x);
            }
            return ans;
        }
        
        int[] f = new int[51];
        for(int x : n){
            f[x]++;
        }

        if(k==1){
            int ans = -1;

            for(int x : n){
                if(f[x] == 1){
                    ans = Math.max(ans,x);
                }
            }
            return ans;
        }

        int ans = -1;
        if(f[n[0]] == 1){
            ans = Math.max(ans,n[0]);         
        }

        if(f[n[m-1]] == 1){
            ans= Math.max(ans,n[m-1]);
        }
        return ans;
    }
}
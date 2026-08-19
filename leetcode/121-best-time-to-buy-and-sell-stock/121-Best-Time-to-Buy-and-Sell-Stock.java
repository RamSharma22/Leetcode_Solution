class Solution {
    public int maxProfit(int[] pr) {
        int b = pr[0];
        int n = pr.length;
        int p = 0;
        for(int i = 1;i < n;i++){
            if(b > pr[i]){
                b = pr[i];
                continue;
            }
            p = Math.max(p,pr[i]-b);
        }
        return p;
    }
}
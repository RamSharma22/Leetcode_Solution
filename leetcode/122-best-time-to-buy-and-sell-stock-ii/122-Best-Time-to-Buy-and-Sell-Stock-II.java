class Solution {
    public int maxProfit(int[] pr) {
        int p = 0;
        for(int i = 1;i < pr.length;i++){
            if(pr[i] > pr[i-1]){
                p += pr[i] - pr[i-1];
            }
        }
        return p;
    }
}
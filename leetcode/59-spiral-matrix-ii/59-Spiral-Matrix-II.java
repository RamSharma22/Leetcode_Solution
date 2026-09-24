class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        int t = 0;
        int b = n-1;
        int l = 0;
        int r = n-1;
        int num = 1;
        while(l <= r && t <= b){
            for(int i = l;i <= r;i++){
                m[t][i] = num++;
            }
            t++;
            for(int i = t;i <= b;i++){
                m[i][r] = num++;
            }
            r--;
            if(t <= b){
                for(int i = r;i >= l;i--){
                    m[b][i] = num++;
                }
                b--;
            }
            if(l <= r){
                for(int i = b;i >= t;i--){
                    m[i][l] = num++;
                }
                l++;
            }
        }
        return m;
    }
}
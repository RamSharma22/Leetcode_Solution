class Solution {
    public void setZeroes(int[][] m) {
        int n1 = m.length;
        int n2 = m[0].length;
        boolean[] r = new boolean[n1];
        boolean[] c = new boolean[n2];
        for(int i = 0;i < n1;i++){
            for(int j = 0;j < n2;j++){
                if(m[i][j] == 0){
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
        for(int i = 0;i < n1;i++){
            for(int j = 0;j < n2;j++){
                if(r[i] || c[j]){
                    m[i][j] = 0;
                }
            }
        }

    }
}
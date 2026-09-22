class Solution {
    public int jump(int[] n) {
        int ri = 0;
        int l = n.length;
        int t = 0;
        int c = 0;
        for(int i = 0;i < l;i++){
            int k = i + n[i];
            ri = Math.max(ri,k);
            if(t >= l-1){
                break;
            }
            if(i == t){
                c += 1;
                t = ri;
            }
        }
        return c;
    }
}
class Solution {
    public boolean canJump(int[] n) {
        int maxr = 0;
        int l = n.length;
        for(int i = 0;i < l;i++){
            if(i > maxr){
                return false;
            }
            maxr = Math.max(maxr,i+n[i]);
            if(maxr >= l-1){
                return true;
            }
        }
        return true;
    }
}
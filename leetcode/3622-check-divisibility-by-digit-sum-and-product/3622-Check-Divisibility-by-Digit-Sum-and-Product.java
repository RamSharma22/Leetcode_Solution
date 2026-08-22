class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int s = 0;
        int m = 1;
        while(t != 0){
            int r = t %10;
            s += r;
            m *= r;
            t /= 10;
        }
        s += m;
        if(n%s == 0){
            return true;
        }
        return false;
    }
}
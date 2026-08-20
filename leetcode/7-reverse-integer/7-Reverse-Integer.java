class Solution {
    public int reverse(int x) {
        long s = 0;
        while(x != 0){
            int r = x%10;
            s = 10*s + r;
            x /= 10;
        }
        if(s < -2147483648 || s > 2147483647){
            s = 0;
        }
        x = (int) s;
        return x;
    }
}
    
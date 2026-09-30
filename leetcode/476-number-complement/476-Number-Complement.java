class Solution {
    public int findComplement(int n) {
        int t = n;
        int m = 0;
        while(t != 0){
            m = (m <<1)|1;
            t = t >> 1;
        }
        return n^m;
    }
}
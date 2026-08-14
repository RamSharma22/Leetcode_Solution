class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int r = 0;
        int l = 0;
        int a = 0;
        int[] f = new int[26];
        for(r = 0;r < n;r++){
            char c = s.charAt(r);
            f[c -  'a'] += 1;
            while(f[c- 'a'] > 2){
                char b = s.charAt(l);
                f[b - 'a'] -= 1;
                l++;
            }
            a = Math.max(a,r-l+1);
        }
        return a;
    }
}
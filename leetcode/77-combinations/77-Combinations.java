class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> a = new ArrayList<>();

        backtrack(n, k, 1, new ArrayList<>(), a);

        return a;
    }
    public void backtrack(
        int n,
        int k,
        int s,
        List<Integer> cr,
        List<List<Integer>> a
    ) {
        if (cr.size() == k) {
            a.add(new ArrayList<>(cr));
            return;
        }
        for (int i = s; i <= n; i++) {

            cr.add(i);

            backtrack(n, k, i + 1, cr, a);

            cr.remove(cr.size() - 1);
        }
    }
}
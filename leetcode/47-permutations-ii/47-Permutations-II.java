class Solution {
    public List<List<Integer>> permuteUnique(int[] n) {

        List<List<Integer>> a = new ArrayList<>();

        Arrays.sort(n);

        boolean[] used = new boolean[n.length];

        backtrack(n, used, new ArrayList<>(), a);

        return a;
    }

    public void backtrack(
        int[] n,
        boolean[] used,
        List<Integer> cr,
        List<List<Integer>> a
    ) {

        if (cr.size() == n.length) {
            a.add(new ArrayList<>(cr));
            return;
        }

        for (int i = 0; i < n.length; i++) {

            if (used[i]) {
                continue;
            }

            // Skip duplicate at same level
            if (i > 0 && n[i] == n[i - 1] && !used[i - 1]) {
                continue;
            }

            cr.add(n[i]);
            used[i] = true;

            backtrack(n, used, cr, a);

            used[i] = false;
            cr.remove(cr.size() - 1);
        }
    }
}
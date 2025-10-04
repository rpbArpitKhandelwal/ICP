class Solution {
    public List<List<Integer>> combine(int n, int k) {
        return backtrack(1, n, k, new ArrayList<>());
    }
    public static List<List<Integer>> backtrack(int start, int n, int k, List<Integer> curr) {
        List<List<Integer>> res = new ArrayList<>();
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return res;
        }
        for (int i = start; i <= n; i++) {
            curr.add(i);
            res.addAll(backtrack(i + 1, n, k, curr));
            curr.remove(curr.size() - 1);
        }
        return res;
    }
}

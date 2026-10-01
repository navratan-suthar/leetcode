class Solution {
    public int maxProfit(int[] p) {
        int min = p[0];
        int maxProfit = 0;

        for (int i = 1; i < p.length; i++) {
            if (p[i] < min) {
                min = p[i];
            } else {
                maxProfit = Math.max(maxProfit, p[i] - min);
            }
        }

        return maxProfit;
    }
}
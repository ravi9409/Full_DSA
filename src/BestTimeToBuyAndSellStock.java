public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] a = { 5, 2, 6, 1, 4, 7, 3, 6 };
        System.out.println(bestTime(a));
    }

    public static int bestTime(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }
}

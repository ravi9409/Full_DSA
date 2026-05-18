package Array.Sliding_Window;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] array=new int[]{8,2,5,3,6,4};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        int sub=0;
        for (int i=0;i<prices.length;i++){
            if(prices[i] < min)
                min=prices[i];
            sub=prices[i]-min;
            maxProfit=Math.max(maxProfit, sub);

        }
        return maxProfit;
    }
}

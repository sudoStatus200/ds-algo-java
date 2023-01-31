import java.util.*;

public class InterestingDrink {
    static int[] solve(int[] prices, int[] daysLimit, int days) {

        int[] result = new int[days];
        for (int i = 0; i < days; i++) {
            int limit = daysLimit[i];
        }

        return result;

    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numShops = sc.nextInt();
        int[] shopPrices = new int[numShops];
        for (int i = 0; i < numShops; i++) {
            shopPrices[i] = sc.nextInt();
        }
        int days = sc.nextInt();
        int[] spentLimit = new int[days];
        for (int i = 0; i < days; i++) {
            spentLimit[i] = sc.nextInt();
        }

        Arrays.sort(shopPrices);

        int[] result = new int[days];
        result = solve(shopPrices, spentLimit, days);

        for (int i = 0; i < days; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}

public class LC_1518_WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int empty = 0, total = 0;

        while (numBottles > 0) {
            total += numBottles;
            empty += numBottles;

            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        return total;
    }
}

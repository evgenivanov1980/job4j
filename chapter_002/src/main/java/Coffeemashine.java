import java.util.Arrays;

public class Coffeemashine {

    private int[] result;

    public int[] changes(int value, int price) {
        int index = 0;
        int oddmoney = value - price;
        int[] coins = new int[] {1, 2, 5 ,10};
        result = new int[coins.length];
        for (int i = 0; i < coins.length; i++) {
            if (oddmoney >= coins[coins.length - i -1]) {
                result[index] = coins[coins.length - i -1];
                oddmoney = oddmoney % coins[coins.length - i -1];
                index++;


            }

        }




        return Arrays.copyOf(result, index);

    }
}

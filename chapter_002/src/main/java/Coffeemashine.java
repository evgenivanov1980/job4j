import java.util.Arrays;

public class Coffeemashine {

    private int[] result;

    public int[] changes(int value, int price) {
        int index = 0;
        int oddmaney = value - price;
        int[] coins = new int[] {1, 2, 5 ,10};
        result = new int[coins.length];
        for (int i = 0; i < coins.length; i++) {
            if (oddmaney >= coins[coins.length - i -1]) {
                result[index] = coins[coins.length - i -1];
                oddmaney = oddmaney % coins[coins.length - i -1];
                index++;


            }

        }




        return Arrays.copyOf(result, index);

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Cashmashina {

    private final int[] values;

    public Cashmashina(int[] values) {
        this.values = values;
    }

    public int[] exchange(int note) {
        int p = 0;
        int[] cnt = new int[values.length];
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            if (note > values[values.length - i - 1]) {
                cnt[i] = note - values[values.length - i - 1];

            }
            else if (note - values[values.length - i - 1]  == 0) {
                cnt[i] = values[values.length - i - 1];
                break;

            }



        }
        return cnt;
    }


}

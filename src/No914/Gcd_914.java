package No914;
import java.util.*;

public class Gcd_914 {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int last = deck[deck.length - 1];
        int[] count = new int[last + 1];

        for (int num: deck) {
            count[num]++;
        }

        int g = -1;
        for (int i = 0; i < last + 1; i++) {
            if (count[i] > 0) {
                if (g == -1) {
                    g = count[i];
                } else {
                    g = gcd(g, count[i]);
                }
            }
        }

        return g >= 2;
    }

    private int gcd(int x, int y) {
        if (y == 0) return x;
        int temp = x % y;
        return gcd(y, temp);
    }
}

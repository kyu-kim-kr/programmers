package skillcheck.levelone;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public int[] solution(int x, int n) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(x * i);
        }

        return toIntArray(list);
    }

    private int[] toIntArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = list.get(i);
        return array;
    }
}

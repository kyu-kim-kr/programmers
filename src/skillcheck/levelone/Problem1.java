package skillcheck.levelone;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public int[] solution(int n, int m) {
        return new int[]{getMaxCommonDivisor(n, m), getMinCommonMultiple(n, m)};
    }

    private int getMinCommonMultiple(int n, int m) {
        int biggerNum = Math.max(n, m);
        int smallerNum = Math.min(n, m);

        List<Integer> biggerNumMultiples = new ArrayList<>();
        List<Integer> smallerNumMultiples = new ArrayList<>();
        for (int i = 1; ; i++) {
            biggerNumMultiples.add(biggerNum * i);
            smallerNumMultiples.add(smallerNum * i);

            for (int j : smallerNumMultiples) {
                if (biggerNumMultiples.contains(j)) {
                    return j;
                }
            }
        }
    }

    private int getMaxCommonDivisor(int n, int m) {
        int biggerNum = Math.max(n, m);
        int smallerNum = Math.min(n, m);

        List<Integer> biggerNumDivisors = new ArrayList<>();
        for (int i = 1; i <= biggerNum; i++) {
            if (biggerNum % i == 0) {
                biggerNumDivisors.add(i);
            }
        }

        List<Integer> commonDivisors = new ArrayList<>();
        for (int i = 1; i <= smallerNum; i++) {
            if ((smallerNum % i == 0) && (biggerNumDivisors.contains(i))) {
                commonDivisors.add(i);
            }
        }

        int maxCommonDivisor = commonDivisors.get(commonDivisors.size() - 1);
        return maxCommonDivisor;
    }
}

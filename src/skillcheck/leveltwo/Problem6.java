package skillcheck.leveltwo;

import java.util.ArrayList;
import java.util.List;

class Problem6 {
    public int[] solution(int[] prices) {
        int count = 0;

        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                answerList.add(count);
                break;
            }

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    count++;

                    if (j == prices.length-1) {
                        answerList.add(count);
                        count = 0;
                        break;
                    }

                } else {
                    count++;
                    answerList.add(count);
                    count = 0;
                    break;
                }
            }
        }
        int[] answer = toIntArray(answerList);

        return answer;
    }

    private int[] toIntArray(List<Integer> integerList) {
        int[] answer = new int[integerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = integerList.get(i);
        }
        return answer;
    }
}

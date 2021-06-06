package skillcheck.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem4 {
    public int solution(int[] A, int[] B) {
        List<Integer> listA = toList(A);
        List<Integer> listB = toList(B);

        Collections.sort(listA);
        Collections.sort(listB, Collections.reverseOrder());

        int listSize = listA.size();

        List<Integer> listC = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            listC.add(listA.get(i) * listB.get(i));
        }

        int sum = 0;
        for (int element : listC) {
            sum += element;
        }

        return sum;
    }

    private List<Integer> toList(int[] array) {
        List<Integer> integerList = new ArrayList<>();
        for (int element : array) {
            integerList.add(element);
        }
        return integerList;
    }
}

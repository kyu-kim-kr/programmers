package skillcheck.leveltwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem3 {
    public String solution(String s) {
        String[] array = s.split(" ");

        List<Integer> integerList = new ArrayList<>();
        for (String element : array) {
            integerList.add(Integer.valueOf(element));
        }

        String answer = Collections.min(integerList) + " " + Collections.max(integerList);


        return answer;
    }
}

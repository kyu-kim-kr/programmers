package skillcheck.level1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        System.out.println(Arrays.toString(problem1.solution(3, 12)));
        System.out.println(Arrays.toString(problem1.solution(2, 5)));

        Problem2 problem2 = new Problem2();
        System.out.println(Arrays.toString(problem2.solution(2, 5)));
        System.out.println(Arrays.toString(problem2.solution(4, 3)));
        System.out.println(Arrays.toString(problem2.solution(-4, 2)));
    }
}

package skillcheck.leveltwo;

public class Problem5 {
    public int solution(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                count++;
                n = n - 1;
            }
        }
        return count;
    }
}

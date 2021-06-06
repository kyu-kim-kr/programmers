package skillcheck.leveltwo;

class Problem2 {
    public int solution(int n, int a, int b) {
        int count = 0;
        while (n != 1) {
            count++;
            n = n / 2;
        }

        int answer = 0;
        for (int i = 1; i <= count; i++) {
            if (a - b == 1 || b - a == 1) {
                answer = i;
                break;
            } else {
                if (a % 2 == 1) {
                    a = a / 2 + 1;
                } else {
                    a = a / 2;
                }

                if (b % 2 == 1) {
                    b = b / 2 + 1;
                } else {
                    b = b / 2;
                }

            }
        }
        return answer;
    }
}

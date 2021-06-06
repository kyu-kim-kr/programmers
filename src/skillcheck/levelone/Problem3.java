package skillcheck.levelone;

class Problem3 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        int lengthX = arr1.length;
        int lengthY = arr1[0].length;

        for (int i = 0; i < lengthX; i++) {
            for (int j = 0; j < lengthY; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}

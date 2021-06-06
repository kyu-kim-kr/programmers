package skillcheck.level3;

import java.util.ArrayList;
import java.util.List;

class Problem1 { // 완성되지 않은 코드
    public int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
        int answer = 0;
        List<int[]> edgeList = toList(edge_list);
        List<int[]> gpsLogList = new ArrayList<>();
        for (int i = 0; i < gps_log.length - 1; i++) {
            gpsLogList.add(new int[]{gps_log[i], gps_log[i + 1]});
        }

        if (edgeList.containsAll(gpsLogList)) {
            return 0;
        } else {
            for(int[] gpsLogArr : gpsLogList) {
                boolean isNotEquals = false;
                for (int[] edgeListArr : edgeList) {
                    if(!gpsLogArr.equals(edgeListArr)) {
                        isNotEquals = true;
                    }
                }
                if(isNotEquals) {

                }
            }
        }

        return answer;
    }

    private List<int[]> toList(int[][] edge_list) {

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < edge_list.length; i++) {
            list.add(edge_list[i]);
        }

        return list;
    }
}

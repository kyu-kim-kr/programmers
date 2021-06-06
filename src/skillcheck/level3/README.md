# 레벨3

## 문제1 (실패)
2017 카카오 본선 - GPS 문제
https://programmers.co.kr/learn/courses/30/lessons/1837

### 시도한 것

먼저 주어진 `gps_log`로 `edge_list`와 비교하기 위해서 새롭게 배열을 만들었습니다. <br>
예를 들어서, `gps_log` 가 [1,2,3,4] 이면, 1시간마다 1->2, 2->3, 3->4로 이동했다는것을 알 수 있습니다. <br>
그렇기 때문에 [1,2], [2,3], [3,4]가 `edge_list`에 들어있다면 오류를 수정하지 않아도 된다는 것입니다. <br>
이런 방식으로 해결하려고 했지만 문제가 있었습니다. <br>
오류수정횟수가 0일때는 `List.containsAll()`을 이용해서 바로 파악이 가능하지만, <br>
오류수정횟수가 1회라도 필요할때는 코드가 아주 복잡해지면서 구현하기가 힘들었습니다. <br>
예를 들어서, [1,2,3,3,5] 일때 [1,2], [2,3], [3,3], [3,5] 로 리스트를 만들게 됩니다. <br>
이때 [3,5] 즉 3~5로 갈수 있는길을 `edge_list` 에서 찾아야하는데 그방법 또한 생각해내기가 힘들었습니다. <br>
결국 시간초과로 해결은 실패했고, 끝나고나서 검색을 해보니 동적 계획법(Dynamic Programming)에 대한 검색결과가 많이나와서 잠깐 그것에대해 배우는 시간을 가졌습니다. <br>

#### 코드 


```java
package skillcheck.level3;

import java.util.ArrayList;
import java.util.List;

class Solution {
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

```

> 걸린시간 : 1시간 20분 + (검색 동적 계획법 공부 20분) <br>
> 2021.06.07

## 문제 2 (실패)

![2021-06-07_10-47-51](https://user-images.githubusercontent.com/59721293/120943450-14e30e80-c783-11eb-9b8b-17f3191a293d.jpg)

### 시도한 것

문제가 입력예제로 나온 배열만 봐서는 이해하기가 힘들어서 그림을 그리면서 해결해보려고 했습니다. <br>
![2021-06-07_10-14-13](https://user-images.githubusercontent.com/59721293/120943494-478d0700-c783-11eb-95f5-72cb13138e94.jpg)

제가 생각했던 방법은 먼저 겹치는 구간을 찾으려고 했습니다. <br>
그리고 겹치는 구간들을 모두 따로 리스트에 저장합니다. <br>
그리고 가장 많이 겹치는 곳에 카메라를 설치하고, 설치된 구간은 리스트에서 삭제합니다. <br>
그러면 동떨어져있는 구간들도 있을텐데 그 구간들도 가장 많이 겹치는 부분에 카메라를 설치하고 설치된 구간은 또 리스트에서 삭제합니다 <br>
그런식으로 쭉쭉 이어나가다 리스트의 길이가 0이면 카메라 갯수를 리턴하려는 방식으로 하려고했습니다. <br>
문제는 제 생각을 어떻게 코드로 구현해야할지 많이 막막해서 코드를 작성하지 못했습니다..ㅠㅠ <br>

> 걸린 시간: 1시간 20분
> 2021.06.07



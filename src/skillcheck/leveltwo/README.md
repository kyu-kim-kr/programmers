# 레벨2

## 문제2
![2021-06-06_16-27-34](https://user-images.githubusercontent.com/59721293/120913922-ae141580-c6ee-11eb-8948-14dc93c41ec2.jpg)

### 해결법

참가자의 수 n = 2^3 <br>
참가자 a = 4 <br>
참가자 b = 7 <br>
<br>
4,3번에서 -> 2번이 됨 -> 1번이 됨 <br>
7,8번에서 -> 4번이 됨 -> 2번이 됨 <br>
<br>
n = 2^4 <br>
a = 5 <br>
b = 16 <br>
<br>
5,6번에서 -> 3번이 됨 -> 2번이 됨 -> 1번이 됨 <br>
15,16번에서 -> 8번이 됨 -> 4번이 됨 -> 2번이 됨 <br>

즉, 홀수번일땐 2로 나누어서 +1 해주면된다. <br>
짝수번일땐 2로 나누기만 하면된다.
<br><br>


```java
class Solution
{
    public int solution(int n, int a, int b)
    {
        if (a-b == 1 || b-a == 1) {
            return 1;
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
        
        if (a-b == 1 || b-a == 1) {
            return 2;
        } else {
            ...
        }
        
        
        return answer;
    }
}
```
하드코딩하면 이런 식으로 나온다.<br>
중복을 없애면 코드가 완성된다. <br>

> 걸린시간 40분 <br>
> 점수 44.1 / 50점 <br>
> 2021.06.06 <br>

## 문제3
![2021-06-06_16-55-19](https://user-images.githubusercontent.com/59721293/120914046-896c6d80-c6ef-11eb-8b0e-76ba60880a87.jpg)

### 해결법
스트링을 split()해서 배열에 담아서
Integer로 변환해서 최대값과 최소값을 구해서 반환했습니다

> 걸린시간 10분 <br>
> 점수 50 / 50점 <br>
> 2021.06.06


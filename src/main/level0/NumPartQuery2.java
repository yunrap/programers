import java.util.Arrays;

public class NumPartQuery2 {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            int[] tempArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                tempArr[i] = arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                if (50 <= arr[i] && (arr[i] % 2 == 0)) {
                    arr[i] = arr[i] / 2;
                } else if (50 > arr[i] && (arr[i] % 2 == 1)) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, tempArr)) {
                break;
            }
            answer++;
        }

        return answer;
    }
}


// :: 조건에 맞게 수열 변환하기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181881

// :: 문제해석
// 50 <= 비교원소&& 짝수면 2로나누고, 50 > 비교원소 && 홀수면 2를곱하고 다시 1더한다.

// :: 접근방법
// 반복문돌려서 조건에맞게 배열에넣은후, 단, 현제인덱스배열 전인덱스인배열 비교해서 같다면 return시킨다

// :: 수정된방법
// 배열대 배열을 복사해야하므로 임시 temp배열에 담아두었다. 배열복사시 = 으로했을경우 참조되어 바뀔수있으므로 조심!


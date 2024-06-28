public class NumPartQuery {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                arr[j] = arr[j] + 1;
            }
        }

        return arr;
    }
}

// :: 수열과 구간쿼리1
// https://school.programmers.co.kr/learn/courses/30/lessons/181883

// :: 접근방법
// queries 첫자리, 마지막자리를 반복문돌려서 +1 시켜서 재배열시킨다.

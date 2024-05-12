public class SectionQuery2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int min = 1000000;
            int count = 0;
            for(int j = s; j < e + 1; j++) {
                if(arr[j] > k) {
                    if(min > arr[j]) {
                        min = arr[j];
                    }
                } else {
                    count++;
                }
            }

            if(count == e - s + 1) {
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
        }

        return answer;
    }
}

// :: 수열과 구간 쿼리2
// https://school.programmers.co.kr/learn/courses/30/lessons/181923

// queries의 3번 반복문을 돌린다
// 도움 Arraylist, sort를 사용하면되겟구나!
// 이랬다가 한시간걸림
// 결과값이 고정배열일대는 최대한 배열로만 생각해서 문제풀기
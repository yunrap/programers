public class CloseFindOne {
    public int solution(int[] arr, int idx) {
        int answer = 0;

        boolean flag = false;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                flag = true;
                break;
            }
        }

        if (!flag)
            answer = -1;

        return answer;
    }
}

// :: 가까운 1찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181898
// 시작점 idx보다 크다면 반복문 start를 idx로 잡아볼까
// 다른사람의풀이 다들 비슷하게 푼거같다
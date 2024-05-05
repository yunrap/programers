public class AddResult {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < included.length; i++) {
            if (i == 0) {
                temp = a;
                if (included[i]) {
                    answer = temp;
                }
            } else {
                temp += d;
                if (included[i]) {
                    answer = temp + answer;
                }
            }
        }
        return answer;
    }
}

// :: 등차수열의 특정한 항만 더하기
// :: 걸린시간 29분 why? 처음들어온값을 어떻게 설정해야하는지 조건문에서 계속 변경함
// https://school.programmers.co.kr/learn/courses/30/lessons/181931
// 누적값 = index값 true 인것을 누적
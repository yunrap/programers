public class NtoMultiply {
    public int solution(int num, int n) {
        int answer = 0;
        answer = num % n == 0 ? 1 : 0;
        return answer;
    }
}

// n의 배수
//https://school.programmers.co.kr/learn/courses/30/lessons/181937
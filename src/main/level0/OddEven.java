public class OddEven {
    public int solution(int n) {
        int answer = 0;

        if (checkOddEven(n)) {
            for (int i = 0; i <= n; i++) {
                answer += checkOddEven(i) ? i*i : 0;
            }
        } else {
            for (int i = 0; i <= n; i++) {
                answer += checkOddEven(i) ? 0 : i;
            }
        }

        return answer;
    }

    public boolean checkOddEven(int n) {
        return n % 2 == 0;
    }

}

// :: 홀짝에 따라 다른값 반환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181935

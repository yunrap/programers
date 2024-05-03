public class ZeroMultiply {
    public int solution(int number, int n, int m) {
        int answer = 0;
        answer = (number % n == 0 && number % m == 0) ?  1 :  0;
        return answer;
    }
}

// :: 공배수
//https://school.programmers.co.kr/learn/courses/30/lessons/181936


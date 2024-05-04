public class ConditionString {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (compareNum(ineq, eq, n, m)) {
            answer = 1;
        }

        return answer;
    }


    private boolean compareNum(String ineq, String eq, int n, int m) {
        if (ineq.equals("<") && eq.equals("=")) {
            return n <= m;
        }
        if (ineq.equals(">") && eq.equals("=")) {
            return n >= m;
        }
        if (ineq.equals("<") && eq.equals("!")) {
            return n < m;
        }
        if (ineq.equals(">") && eq.equals("!")) {
            return n > m;
        }
        return false;
    }
}

// :: 조건문자열
// :: 걸린시간 : 30분  why? 문자열을 equals 자료찾아보다가 조금걸림, 4개 조건잡는것 등등
//https://school.programmers.co.kr/learn/courses/30/lessons/181934

public class StringMultiply {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < k; i++) {
            answer.append(my_string);
        }
        return answer.toString();
    }
}

// :: 문자열곱하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181940
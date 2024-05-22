public class HeightRead {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int n = my_string.length();
        for (int i=c-1; i<n; i+=m) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}

// :: 세로 읽기
// https://school.programmers.co.kr/learn/courses/30/lessons/181904
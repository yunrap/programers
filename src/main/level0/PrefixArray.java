import java.util.Arrays;

public class PrefixArray {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}

// :: 접미사배열
// https://school.programmers.co.kr/learn/courses/30/lessons/181909

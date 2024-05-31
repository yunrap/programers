import java.util.Arrays;

public class TextErase {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            int val = i;
            if (!Arrays.stream(indices).anyMatch(a -> a == val))
                answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }
}

// :: 글자지우기
// https://school.programmers.co.kr/learn/courses/30/lessons/181900

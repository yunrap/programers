public class PrefixIsTrue {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] list = new String[my_string.length()];

        int v = 0;
        for (int i = 0; i < my_string.length(); i++) {
            list[v] = my_string.substring(0, i);
            v++;
        }

        for (String s : list) {
            if (s.equals(is_prefix)) {
                answer = 1;
            }
        }

        return answer;
    }
}

// :: 접두사인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181906
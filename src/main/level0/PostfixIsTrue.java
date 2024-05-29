public class PostfixIsTrue {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] list = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            list[i] = my_string.substring(i);
        }

        for (String s : list) {
            if (s.equals(is_suffix)) {
                answer = 1;
            }
        }

        return answer;
    }
}
// :: 접미사인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181908

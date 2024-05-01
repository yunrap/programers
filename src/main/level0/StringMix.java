public class StringMix {
    public String  solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return answer.toString();
    }
}

// :: 문자열섞기
// https://school.programmers.co.kr/learn/courses/30/lessons/181942
// str1 첫째 + str2 첫재 이렇게붙여서 반복문돌리자
public class ListToString {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }
        return answer.toString();
    }
}

// :: 문자리스트를 문자열로 변환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181941
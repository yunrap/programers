public class PartString2 {
    public int solution(String str1, String str2) {
        int answer = 0;

        if(str2.contains(str1)){
            answer = 1;
        }

        return answer;
    }
}

// :: 부분문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181842
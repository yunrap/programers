public class PartStringCk {
    public int solution(String my_string, String target) {
        int answer = 0;

        if(my_string.contains(target)){
            answer = 1;
        }

        return answer;
    }
}

// :: 부분문자열인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181843

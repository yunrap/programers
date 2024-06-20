public class SpecialChange {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if(alp.charAt(0) == my_string.charAt(i)){
                answer.append(alp.toUpperCase());
            }else{
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}

// :: 특정한 문자를 대문자로 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/181873
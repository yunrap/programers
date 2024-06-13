public class StringChange {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A'){
                sb.append('B');
            }else{
                sb.append('A');
            }
        }

        if(sb.toString().contains(pat))
            answer = 1;

        return answer;
    }
}

// :: 문자열 바꿔서 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181864
// 다른사람의풀이 -> 아 replace String 메소드도 사용할수있구나

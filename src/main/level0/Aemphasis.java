public class Aemphasis {
    public String solution(String myString) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) != 'A' && Character.isUpperCase(myString.charAt(i))){
                answer.append(Character.toLowerCase(myString.charAt(i)));
            }else if(myString.charAt(i) == 'a'){
                answer.append('A');
            }else{
                answer.append(myString.charAt(i));
            }
        }

        return answer.toString();
    }
}

// :: A 강조하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181874
// 알파멧 a면 -> 전부 A로
// A가아닌모든대문자알파벳 -> 소문자로

// :: 다른사람의풀이
// 잘생각해보면 다 소문자로바꾸고 그냥 a만 A로 바꾸면되구나, 순서를 잘생각하고 코딩할것.

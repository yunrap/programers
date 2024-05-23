public class StringReverse2 {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        StringBuilder answerReverse = new StringBuilder();

        for (int i = 0; i < s; i++) {
            answer.append(my_string.charAt(i));
        }

        for (int j = s; j <= e; j++) {
            answerReverse.append(my_string.charAt(j));
        }
        answerReverse.reverse();

        answer.append(answerReverse);

        for (int v = e + 1; v < my_string.length(); v++) {
            answer.append(my_string.charAt(v));
        }

        return answer.toString();
    }
}

// 문제URL : https://school.programmers.co.kr/learn/courses/30/lessons/181905
// :: 문자열 뒤집기
// :: 걸린시간 13분 근데 이렇게 직관적으로 소스코드를 해도될까 해서 찾아봄 ... 에구 substring 써먹어자 소스코드가 예뻐지네

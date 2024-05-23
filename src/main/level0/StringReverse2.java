public class StringReverse2 {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        StringBuilder answerReverse = new StringBuilder();

        for (int i = 0; i < s; i++) {
            answer.append(my_string.charAt(s));
        }

        for (int i = s; i < e; i++) {
            answerReverse.append(my_string.charAt(i));
        }
        answerReverse.reverse();

        answer.append(answerReverse);

        for (int j = e; j < my_string.length(); j++) {
            answer.append(my_string.charAt(j));
        }

        return answer.toString();
    }
}

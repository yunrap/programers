public class DevideNine {
    public int solution(String number) {
        int answer = 0;

        for (int n = 0; n < number.length(); n++) {
            answer += number.charAt(n) - '0';
        }

        answer = answer % 9;
        return answer;
    }
}

// 아스키코드값을 생각한 char -> int 형으로 변하는방법이있구나.
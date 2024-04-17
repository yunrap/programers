public class QrCode {
    public String solution(int q, int r, String code) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                char data = code.charAt(i);
                stringBuilder.append(data);
            }
        }
        return stringBuilder.toString();
    }
}

// String인덱스 % q == 1 이면 result에 담는다
// String을 문자개수만큼 반복문을 돌린다

// StringBuilder -> concat과는 다르게 같은주소로사용한다.

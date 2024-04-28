public class StringOverwrite {

    public String solution(String my_string, String overwrite_string, int s) {
        int startIndex = s;
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < overwrite_string.length(); i++) {
            sb.setCharAt(startIndex, overwrite_string.charAt(i));
            startIndex++;
        }

        return sb.toString();
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181943

// s인덱스 < 기준 < overwrite길이  -> my_string을 치환해준다
// 사용방법 : StringBuilder 가변한문자열을 다루는클래스를 사용해보자
// setCharAt ->해당인텍스를, 뒤에문자열로 치환해준다.
// charAt => 해당인덱스의 문자를 반환한다.

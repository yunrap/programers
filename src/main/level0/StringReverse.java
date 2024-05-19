public class StringReverse {
    public String solution(String my_string, int[][] queries) {
        String tempAnswer = my_string;

        for (int i = 0; i < queries.length; i++) {
            int startIndex = queries[i][0];
            int lastIndex = queries[i][1];
            StringBuilder answer = new StringBuilder();


            for (int j = startIndex; j <= lastIndex; j++) {
                answer.append(tempAnswer.charAt(j));
            }

            tempAnswer = tempAnswer.substring(0, startIndex) + answer.reverse()
                    + tempAnswer.substring(lastIndex + 1);
        }

        return tempAnswer;
    }
}

// 자리수만잡아서 안바뀌는곳+ 바뀌는곳 + 안바뀌는곳 이렇게 세가지로나누면 되구나
// 걸린시간 : 40분 why? 위에처럼 접근하는 방법이생각이안나서 계속 수정, 부분문자열교체 생각할때는 subString 떠올려도괜찮겠다
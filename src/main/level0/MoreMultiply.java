public class MoreMultiply {
    public int solution(int a, int b) {
        int answer = 0;

        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        int intA = Integer.parseInt(strA + strB);
        int intB = Integer.parseInt(changeString(strA, strB));

        if (compareInt(intA, intB)) {
            answer = Integer.parseInt(strA + strB);
        } else {
            answer = Integer.parseInt(strB + strA);
        }
        return answer;
    }

    private String changeString(String strA, String strB) {
        return strB + strA;
    }

    public boolean compareInt(int intA, int intB) {
        return intA > intB;
    }

}

// :: 더크게 합치기
//https://school.programmers.co.kr/learn/courses/30/lessons/181939
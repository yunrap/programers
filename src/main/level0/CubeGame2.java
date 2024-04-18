public class CubeGame2 {
    public int solution(int a, int b, int c) {

        if (a != b && b != c && a != c) {
            return a + b + c;
        }

        if (isTwoNumberEquals(a, b, c)) {
            return calculateEqualsTwoNumber(a, b, c);
        }

        if (isThreeNumberEquals(a, b, c)) {
            return calculateEqualsThreeNumber(a, b, c);
        }

        return a + b + c;
    }

    private boolean isTwoNumberEquals(int a, int b, int c) {
        return (a == b) || (a == c) || (b == c);
    }

    private boolean isThreeNumberEquals(int a, int b, int c) {
        return a == b && b == c;
    }

    private int calculateEqualsTwoNumber(int a, int b, int c) {
        return (a + b + c) * (a * a + b * b + c * c);
    }

    private int calculateEqualsThreeNumber(int a, int b, int c) {
        return (a + b + c) * (a * a + b * b + c * c) * ((int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3));
    }


}

// https://school.programmers.co.kr/learn/courses/30/lessons/181930
// 세숫자가 모두다르면 a+b+c 점을 얻는다
// 두숫자가같고 한숫는다르다면 (a+b+c) x (a*a + b*b + c*c)
// 세숫자가 모두같다면 (a+b+c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c)

// 최대값을 하나로 기준을 잡는다.

// 리팩토링> 함수화서 공통된코드사용하기, else문사용하지말것되도록
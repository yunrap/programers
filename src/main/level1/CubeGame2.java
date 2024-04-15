public class CubeGame2 {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else if (a == b && b != c) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if (b == c && a != b) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if (a == c && b != c) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if (a == b && b == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }

        return answer;
    }
}

// 세숫자가 모두다르면 a+b+c 점을 얻는다
// 두숫자가같고 한숫는다르다면 (a+b+c) x (a*a + b*b + c*c)
// 세숫자가 모두같다면 (a+b+c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c)

// 최대값을 하나로 기준을 잡는다.

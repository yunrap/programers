public class CountPlay1 {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            n = calculatePlay(control.charAt(i), n);
        }
        return n;
    }

    private int calculatePlay(char charAt, int accVal) {
        return switch (charAt){
            case 'w' -> accVal + 1;
            case 's' -> accVal - 1;
            case 'd' -> accVal + 10;
            case 'a' -> accVal - 10;
            default -> throw new IllegalStateException("Unexpected value: " + charAt);
        };
    }
}

// :: 수조작하기
// :: 걸린시간 15분 why? swith case yield사용해보려다가 자동완성기능으로 그냥 시도
// https://school.programmers.co.kr/learn/courses/30/lessons/181926

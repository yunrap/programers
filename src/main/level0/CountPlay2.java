public class CountPlay2 {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numLog.length; i++) {
            if(i != numLog.length-1)
            answer.append(calculatePlay(numLog[i], numLog[i + 1]));
        }
        return answer.toString();
    }

    private String calculatePlay(int current, int next) {
        return switch (next - current){
            case 1 -> "w";
            case -1 -> "s";
            case 10 -> "d";
            case -10 -> "a";
            default -> throw new IllegalStateException("Unexpected value: " + current);
        };
    }
}

// :: 수조작하기2
// https://school.programmers.co.kr/learn/courses/30/lessons/181925

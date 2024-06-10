import java.util.Arrays;

public class Nfrom {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        int[] answer2 = Arrays.copyOfRange(num_list, n-1 ,num_list.length);
        return answer2;
    }
}

// :: n번째원소까지
// https://school.programmers.co.kr/learn/courses/30/lessons/181892
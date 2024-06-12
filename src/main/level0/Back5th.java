import java.util.Arrays;

public class Back5th {
    public int[] solution(int[] num_list) {

        Arrays.sort(num_list);
        int[] answer = Arrays.copyOfRange(num_list, 5 ,num_list.length);
        return answer;
    }
}

// :: 뒤에서 5등뒤로
// https://school.programmers.co.kr/learn/courses/30/lessons/181852
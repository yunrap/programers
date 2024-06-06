import java.util.ArrayList;
import java.util.List;

public class MakeArray3 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> stk = new ArrayList<>();

        int start;
        int end;
        for (int[] interval : intervals) {
            start = interval[0];
            end = interval[1];

            for (int a = start; a <= end; a++) {
                stk.add(arr[a]);
            }
        }
        return stk.stream().mapToInt(j -> j).toArray();
    }
}

// 배열만들기 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181895

import java.util.ArrayList;
import java.util.List;

public class NpaddingEl {
    public int[] solution(int[] num_list, int n) {
        List<Integer> arrayList = new ArrayList<>();


        for (int i = 0; i < num_list.length; i+=n) {
            arrayList.add(num_list[i]);
        }

        return arrayList.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}

// :: n 간격의원소들
// https://school.programmers.co.kr/learn/courses/30/lessons/181888
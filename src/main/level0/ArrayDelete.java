import java.util.ArrayList;
import java.util.List;

public class ArrayDelete {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int d = 0; d < delete_list.length; d++) {
                if (arr[i] == delete_list[d]) {
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}

// :: 배열의 원소 삭제하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181844

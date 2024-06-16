import java.util.ArrayList;
import java.util.List;

public class ArrayListAdd {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int index : arr) {
            for (int j = 0; j < index; j++) {
                list.add(index);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

// :: 배열의 원소만큼 추가하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181861

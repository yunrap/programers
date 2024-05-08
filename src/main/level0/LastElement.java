import java.util.ArrayList;
import java.util.List;

public class LastElement {
    public int[] solution(int[] num_list) {
        List<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < num_list.length; i++) {
            numList.add(num_list[i]);
            // 마지막원소일때
            if (i == num_list.length-1) {
                int appendVal = checkVal(num_list[i - 1], num_list[i]);
                numList.add(appendVal);
            }
        }

        return numList.stream()
                .mapToInt(i -> i)
                .toArray();

    }

    private int checkVal(int lastPrevVal, int lastVal) {
        if (lastPrevVal < lastVal) {
            return lastVal - lastPrevVal;
        } else {
            return lastVal * 2;
        }
    }
}

// :: 마지막두원소
// :: 걸린시간 30분 why? 배열 -> list  list->배열 익숙해질만한디
// https://school.programmers.co.kr/learn/courses/30/lessons/181927

// 그전원소 < 마지막원소 ==> 마지막원소 - 그전원소
// 그전원소 > 마지막원소 ==> 마지막원소 * 마지막원소

// :: 다른사람풀이 : 아 그냥 배열을 한자리수늘려서 그값을 넣어줘도되구낭


import java.util.ArrayList;
import java.util.List;

public class MakeArray4 {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            }

        }

        int[] stkReturn = stk.stream().mapToInt(j -> j).toArray();
        return stkReturn;
    }
}

// :: 배열만들기 4
// :: 걸린시간 30분 why? 조건이 조금있어서 집중이잘안됨
//https://school.programmers.co.kr/learn/courses/30/lessons/181918

// i < arr.length 아래작업을 반복한다.
// stk 마지막원소 < arr[i]  =>  stk + arr[i] 하고 i++
// stk 마지막원소 >= arr[i] => stk 마지막원소제거
// 빈배열이면 stk += arr[i] 하고 i++

// 아 스택방법으로 하는것도 있구나 내일적용

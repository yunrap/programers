import java.util.ArrayList;
import java.util.List;

public class MakeArray {
    public int[] solution(int l, int r) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            boolean flag = false;
            String lValue = Integer.toString(i);

            for (int j = 0; j < lValue.length(); j++) {
                if (lValue.charAt(j) == '5' || lValue.charAt(j) == '0') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                arrayList.add(Integer.parseInt(lValue));
            }
        }

        if (arrayList.isEmpty()) {
            arrayList.add(-1);
        }

        int answer[] = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}

// :: 배열만들기 2
// :: 걸린시간 33분 why? 문자를 5와 0 으로 둘다 포함을 어떻게잡아내지? 부분에서 조금걸림
// https://school.programmers.co.kr/learn/courses/30/lessons/181921

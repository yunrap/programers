import java.util.Arrays;

public class SeqChange {
    public int[] solution(int[] num_list, int n) {

        int[] ans = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] ans2 = Arrays.copyOfRange(num_list, 0, n);

        int[] answer = new int[ans.length + ans2.length];
        System.arraycopy(ans, 0, answer, 0, ans.length);
        System.arraycopy(ans2, 0, answer, ans.length, ans2.length);

        return answer;
    }
}

// :: 순서바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/181891
// 다른사람의풀이 : 어차피 고정배열이니 배열잡고 반복문돌려도되구나

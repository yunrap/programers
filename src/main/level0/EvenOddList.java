public class EvenOddList {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        return Math.max(even, odd);
    }
}

// :: 홀수 vs 짝수
// https://school.programmers.co.kr/learn/courses/30/lessons/181887
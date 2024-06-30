public class MakeOne {
    public int solution(int[] num_list) {
        int count = 0;

        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {

                if (num_list[i] % 2 == 0) {
                    num_list[i] = num_list[i] / 2;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                }
                count++;
            }
        }

        return count;
    }
}

// :: 1로만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181880

// :: 문제해석
// 짝수라면 반으로나누고, 홀수라면 1뺀뒤반으로나눈다. 1까지만들기위한 횟수를구한다

// :: 접근방법
// 담겨있는수 반복문돌린다. while문 1일때까지 위의조건을반복 , 돌린 카운트를 count++


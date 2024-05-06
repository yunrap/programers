public class MultiplySum {
    public int solution(int[] num_list) {
        int accMultiply = 1;
        int accSum = 0;
        for (int i = 0; i < num_list.length ; i++) {
            accMultiply = accMultiply * num_list[i];
            accSum = accSum + num_list[i];
        }

        if(accMultiply < accSum*accSum)
        {
            return 1;
        }
        return 0;
    }
}

// :: 원소들의 곱과 합
// :: 걸린시간 5분 why? 쉽지아니한가.
// https://school.programmers.co.kr/learn/courses/30/lessons/181929


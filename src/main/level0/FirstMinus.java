public class FirstMinus {
    public int solution(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]< 0){
                answer = i;
                break;
            }
        }

        return answer;
    }
}

// :: 첫번째로 나오는 음수
// https://school.programmers.co.kr/learn/courses/30/lessons/181896
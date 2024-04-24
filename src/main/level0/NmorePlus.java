public class NmorePlus {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            if (answer <= n) {
                answer += number;
            }else{
                break;
            }
        }
        return answer;
    }
}


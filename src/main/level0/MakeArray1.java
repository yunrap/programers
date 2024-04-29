public class MakeArray1 {
    public int[] solution(int n, int k) {

        int v = n/k;
        int[] answer = new int[v];

        for (int i = 0; i < v; i++) {
            if(k * (i+1) <= n){
                answer[i] = k * (i+1);
            }else{
                break;
            }
        }
        return answer;
    }
}

// n개 이하의정수중에서 k배수
// 배열자리수 임시만들기
// k * for문 index > n 면 result배열에담는다. 아닐시 break;

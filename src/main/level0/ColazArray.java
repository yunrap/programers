import java.util.ArrayList;
import java.util.List;

public class ColazArray {
    public int[] solution(int n) {
        List<Integer> arrayList = new ArrayList<>();

        while (n != 1){
            arrayList.add(n);
            n = foundOdd(n);
        }
        arrayList.add(1);
        return arrayList.stream().mapToInt(i -> i).toArray();
    }

    private int foundOdd(int n) {
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }
        return n;
    }
}

// :: 콜라츠 수열 만들기
// :: 걸린시간 13분
// https://school.programmers.co.kr/learn/courses/30/lessons/181919
// x가 짝수일때  x % 2 == 0,  x가 홀수일때  3 * x + 1 , x가 1일될때



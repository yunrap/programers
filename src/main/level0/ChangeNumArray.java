import java.util.ArrayList;
import java.util.List;

public class ChangeNumArray {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int j : arr) {
            if (j >= 50 && j % 2 == 0) {
                list.add(j / 2);
            } else if (j < 50 && j % 2 != 0) {
                list.add(j * 2);
            } else {
                list.add(j);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
// :: 조건에 맞게 수열 변환하기 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181882

// 50 보다크거나 같은짝수면 2나누기
// 50보다 작은 홀수라면 2 곱하기

// :: 접근방법
// 반복문으로 배열을돌려서 조건에맞게설정후 결과값을 리스트에 담아놓기
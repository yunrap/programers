import java.util.ArrayList;
import java.util.List;

public class ListSlice {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        var answer = stringSlice(n, slicer, num_list);
        return answer.stream().mapToInt(i -> i).toArray();
    }

    private List<Integer> stringSlice(int n, int[] slicer, int[] numList) {
        List<Integer> listList = new ArrayList<>();
        switch (n) {
            case 1 -> {
                for (int i = 0; i <= slicer[1]; i++) {
                    listList.add(numList[i]);
                }
            }
            case 2 -> {
                for (int i = slicer[0]; i <= numList.length-1; i++) {
                    System.out.println(numList[i]);
                    listList.add(numList[i]);
                }
            }
            case 3 -> {
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    listList.add(numList[i]);
                }
            }
            case 4 -> {
                for (int i = slicer[0]; i <= slicer[1]; i+= slicer[2]) {
                    listList.add(numList[i]);
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + n);
        }
        return listList;
    }
}

// :: 리스트자르기
//https://school.programmers.co.kr/learn/courses/30/lessons/181897
// 숫자에따른 인덱스자르기 규칙이있다면 case로 경우를 나눠보자
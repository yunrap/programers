import java.util.ArrayList;
import java.util.List;

public class ArraySlice {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();

        for (int j : arr) {
            list.add(j);
        }

        for (int i = 0; i < query.length; i++) {
            if(i % 2 == 0){
                list = list.subList(0, query[i]+1);
            }else{
                list = list.subList(query[i],list.size());
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181893
// :: 배열 조각하기

// 짝수인덱스면 n번째 뒷부분자른다, 홀수인덱스면 n번째 앞부분을자른다.
// :: 알게된점 sublist는 from부터 to까지 반환해주는 리스트메서드

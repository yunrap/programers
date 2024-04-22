import java.util.Arrays;

public class Sort5thFind {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);

        for (int i = 0; i < answer.length; i++) {
            answer[i]= num_list[i];
        }
        return answer;

    }
}

// 문제 url : https://school.programmers.co.kr/learn/courses/30/lessons/181853
// 배열을 오름차순으로 정렬한다.
// 정렬후 6번째부터 결과배열에 담는다.

// 문제풀이과정
// 배열을 오름차순으로 어떻게 구하지? Arrays 클래스가있다 -> 배열의 복사, 항목 정렬검색과같은 배열의 조작기능제공
// 구했는데 배열을 6자리수부터 끝까지 어떻게 넣지?
// 배열을 5개로 고정해서 자리수에넣기


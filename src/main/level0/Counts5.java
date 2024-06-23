import java.util.ArrayList;
import java.util.List;

public class Counts5 {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();

        System.out.println(names.length);
        for (int i = 0; i <= (names.length-1)/5; i++) {
            int index = i * 5;
            list.add(names[index]);
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181886
// :: 5명씩

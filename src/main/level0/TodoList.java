import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<String>();
        for (int i = 0; i < finished.length ; i++) {
            if(finished[i] == false){
                answer.add(todo_list[i]);
            }
        }

        int answerListSize = answer.size();
        String arr[] = answer.toArray(new String[answerListSize]);
        return arr;
    }
}

// 해야할일들이 false인것들만 result배열에 옮긴다
// finished 배열 반복후 false일때 todoList에서 꺼낸다.
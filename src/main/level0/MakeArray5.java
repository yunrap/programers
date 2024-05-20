import java.util.ArrayList;
import java.util.List;

public class MakeArray5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();

        for (String intStr : intStrs) {
            String tempStr = "";
            tempStr = makeCutString(intStr, s, l);

            if (k < Integer.parseInt(tempStr)) {
                answerList.add(Integer.parseInt(tempStr));
            }
        }

        answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    private String makeCutString(String intStrs, int s, int l) {
        String tempStr = "";

        for (int i = s; i < l + s; i++) {
            tempStr += intStrs.charAt(i);
        }
        return tempStr;
    }
}


// 문제URL : https://school.programmers.co.kr/learn/courses/30/lessons/181912
// :: 배열만들기 5
// :: 걸린시간 14분 map,list,String 메소드 이제 조금 익숙



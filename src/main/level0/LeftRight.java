import java.util.ArrayList;
import java.util.List;

public class LeftRight {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();

        int[] startEnd = findIndexLeftRight(str_list);


        for (int j = startEnd[0]; j < startEnd[1]; j++) {
            list.add(str_list[j]);
        }

        int answerListSize = list.size();
        String arr[] = list.toArray(new String[answerListSize]);
        return arr;
    }

    private int[] findIndexLeftRight(String[] strList) {
        int[] startEnd = new int[2];
        for (int i = 0; i < strList.length; i++) {

            if (strList[i].equals("l")) {
                startEnd[1] = i;
                break;
            }

            if (strList[i].equals("r")) {
                startEnd[0] = i+1;
                startEnd[1] = strList.length;
                break;
            }

        }

        return startEnd;
    }

}

// :: 왼쪽 오른쪽
// https://school.programmers.co.kr/learn/courses/30/lessons/181890
// 다른사람의풀이 : 배열을 가변으로 바꿀때는 copyOfRange 사용하면 되구나...
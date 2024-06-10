public class TailString {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str_list.length; i++) {
            if(!str_list[i].contains(ex)){
                answer.append(str_list[i]);
            }
        }
        return answer.toString();
    }
}

// :: 꼬리문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181841
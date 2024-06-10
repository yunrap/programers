public class RemoveZero {
    public String solution(String n_str) {
        String answer = "";

        int index = 0;
        for (int i = 0; i < n_str.length() ; i++) {
            if(n_str.charAt(i) != '0'){
                index = i;
                break;
            }
        }

        answer = n_str.substring(index, n_str.length());
        return answer;
    }
}


// :: 0 떼기
// https://school.programmers.co.kr/learn/courses/30/lessons/181847
// :: 다른사람의풀이   return ""+Integer.parseInt(n_str); 이렇게한줄에끝날수도있구나

public class TextAttachString {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

        for (int j : index_list) {
            answer.append(my_string.charAt(j));
        }

        return answer.toString();
    }
}

// 걸린시간 5분 쉽지아니한가..
public class StringNumCount {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        char engChar[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};


        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < engChar.length; j++) {
                if(my_string.charAt(i) == engChar[j]){
                    answer[j] ++;
                }
            }
        }

        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181902
// 다른사람의풀이 : 소문자 answer[입력문자 - 'a' + 26]++;  대문자 answer[c - 'A']++; 이렇게 표현할수있군
// 대문자 65 < <90 // 소문자 97 < < 122

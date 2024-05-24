public class PartString {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int p = 0; p < parts.length; p++) {
            int startIndex = parts[p][0];
            int endIndex = parts[p][1];

            String str = my_strings[p].substring(startIndex, endIndex + 1);
            answer.append(str);
        }

        return answer.toString();
    }
}

// substring은 뒤 인덱스 마지막은 불포함이구나
import java.util.HashMap;
import java.util.Map;

public class MosChar {
    public String solution(String letter) {
        String answer = "";

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Map<String, Character> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], (char) (97 + i));
        }

        String[] letterArr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String val : letterArr) {
            sb.append(morseMap.get(val));
        }

        answer = sb.toString();
        return answer;
    }
}

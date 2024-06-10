import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class TailStringTest {

    @Test
    void solution() {
        TailString tailString = new TailString();
        Assertions.assertThat(tailString.solution(new String[]{"abc", "def", "ghi"}, "ef")).isEqualTo("abcghi");
        Assertions.assertThat(tailString.solution(new String[]{"abc", "bbc", "cbc"}, "c")).isEqualTo("");
    }
}
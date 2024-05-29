import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringPrevNTest {

    @Test
    void solution() {
        StringPrevN stringPrevN = new StringPrevN();
        Assertions.assertThat(stringPrevN.solution("ProgrammerS123", 11)).isEqualTo("ProgrammerS");
        Assertions.assertThat(stringPrevN.solution("He110W0r1d", 5)).isEqualTo("He110");
    }
}
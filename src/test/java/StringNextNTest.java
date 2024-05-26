import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class StringNextNTest {

    @Test
    void solution() {
        StringNextN stringNextN = new StringNextN();
        Assertions.assertThat(stringNextN.solution("ProgrammerS123", 11)).isEqualTo("grammerS123");
        Assertions.assertThat(stringNextN.solution("He110W0r1d", 5)).isEqualTo("W0r1d");
    }
}
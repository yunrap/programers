import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class StringReverse2Test {

    @Test
    void solution() {
        StringReverse2 stringReverse2 = new StringReverse2();
        Assertions.assertThat(stringReverse2.solution("Progra21Sremm3", 6, 12)).isEqualTo("ProgrammerS123");
    }
}
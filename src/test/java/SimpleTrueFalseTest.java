import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleTrueFalseTest {

    @Test
    void solution() {
        SimpleTrueFalse simpleTrueFalse = new SimpleTrueFalse();
        Assertions.assertThat(simpleTrueFalse.solution(false, true, true, true)).isEqualTo(true);
        Assertions.assertThat(simpleTrueFalse.solution(true, true, false, false)).isEqualTo(false);
    }
}
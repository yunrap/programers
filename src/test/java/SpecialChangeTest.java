import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class SpecialChangeTest {

    @Test
    void solution() {
        SpecialChange specialChange = new SpecialChange();
        Assertions.assertThat(specialChange.solution("programmers", "p")).isEqualTo("Programmers");
        Assertions.assertThat(specialChange.solution("lowercase", "x")).isEqualTo("lowercase");
    }
}
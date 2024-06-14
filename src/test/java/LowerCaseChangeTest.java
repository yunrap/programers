import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class LowerCaseChangeTest {

    @Test
    void solution() {
        LowerCaseChange lowerCaseChange = new LowerCaseChange();
        Assertions.assertThat(lowerCaseChange.solution("aBcDeFg")).isEqualTo("abcdefg");
    }
}
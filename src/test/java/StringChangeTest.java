import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class StringChangeTest {

    @Test
    void solution() {
        StringChange stringChange = new StringChange();
        Assertions.assertThat(stringChange.solution("ABBAA", "AABB")).isEqualTo(1);
        Assertions.assertThat(stringChange.solution("ABAB", "ABAB")).isEqualTo(0);
    }
}
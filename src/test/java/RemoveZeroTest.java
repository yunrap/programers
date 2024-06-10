import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
class RemoveZeroTest {

    @Test
    void solution() {
        RemoveZero removeZero = new RemoveZero();
        Assertions.assertThat(removeZero.solution("0010")).isEqualTo("10");
        Assertions.assertThat(removeZero.solution("854020")).isEqualTo("854020");
    }
}
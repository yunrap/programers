import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
class StringToIntTest {

    @Test
    void solution() {
        StringToInt stringToInt = new StringToInt();
        Assertions.assertThat(stringToInt.solution("12")).isEqualTo(12);
    }
}
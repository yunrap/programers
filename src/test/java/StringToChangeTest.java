import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class StringToChangeTest {

    @Test
    void solution() {
        StringToChange stringToChange = new StringToChange();
        Assertions.assertThat(stringToChange.solution(123)).isEqualTo("123");
    }
}
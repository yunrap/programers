import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class ListToStringTest {

    @Test
    void solution() {
        ListToString listToString = new ListToString();
        Assertions.assertThat(listToString.solution(new String[]{"a", "b", "c"})).isEqualTo("abc");
    }
}
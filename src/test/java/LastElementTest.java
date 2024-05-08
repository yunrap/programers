import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class LastElementTest {

    @Test
    void solution() {
        LastElement lastElement = new LastElement();
        Assertions.assertThat(lastElement.solution(new int[]{2, 1, 6})).isEqualTo(new int[]{2, 1, 6, 5});
    }
}
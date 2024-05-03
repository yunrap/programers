import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class MoreMultiplyTest {

    @Test
    void solution() {
        MoreMultiply moreMultiply = new MoreMultiply();
        Assertions.assertThat(moreMultiply.solution(9,91)).isEqualTo(991);
    }
}
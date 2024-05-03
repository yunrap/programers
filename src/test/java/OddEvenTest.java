import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class OddEvenTest {

    @Test
    void solution() {
        OddEven oddEven = new OddEven();
        Assertions.assertThat(oddEven.solution(7)).isEqualTo(16);
        Assertions.assertThat(oddEven.solution(10)).isEqualTo(220);

    }
}
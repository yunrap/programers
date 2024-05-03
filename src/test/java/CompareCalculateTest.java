import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class CompareCalculateTest {

    @Test
    void solution() {
        CompareCalculate compareCalculate = new CompareCalculate();
        Assertions.assertThat(compareCalculate.solution(2, 91)).isEqualTo(364);
    }
}
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class IntegerPartTest {

    @Test
    void solution() {
        IntegerPart integerPart = new IntegerPart();
        Assertions.assertThat(integerPart.solution(1.42)).isEqualTo(1);
    }
}
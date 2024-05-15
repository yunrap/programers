import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class CountUpTest {

    @Test
    void solution() {
        CountUp count = new CountUp();
        Assertions.assertThat(count.solution(3, 10)).isEqualTo(new int[]{3, 4, 5, 6, 7, 8, 9, 10});
    }
}
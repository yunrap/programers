import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class CountDownTest {

    @Test
    void solution() {
        CountDown countDown = new CountDown();
        Assertions.assertThat(countDown.solution(10, 3)).isEqualTo(new int[]{10, 9, 8, 7, 6, 5, 4, 3});
    }
}
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class CloseFindOneTest {

    @Test
    void solution() {
        CloseFindOne closeFindOne = new CloseFindOne();
        Assertions.assertThat(closeFindOne.solution(new int[]{0, 0, 0, 1}, 1)).isEqualTo(3);
        Assertions.assertThat(closeFindOne.solution(new int[]{1, 0, 0, 1, 0, 0}, 4)).isEqualTo(-1);
        Assertions.assertThat(closeFindOne.solution(new int[]{1, 1, 1, 1, 0}, 3)).isEqualTo(3);
    }
}
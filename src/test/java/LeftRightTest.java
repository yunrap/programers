import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class LeftRightTest {

    @Test
    void solution() {
        LeftRight leftRight = new LeftRight();
        Assertions.assertThat(leftRight.solution(new String[]{"u", "u", "l", "r"})).isEqualTo(new String[]{"u", "u"});
        Assertions.assertThat(leftRight.solution(new String[]{"l"})).isEqualTo(new String[]{});
        Assertions.assertThat(leftRight.solution(new String[]{"u", "u", "r", "d", "l"})).isEqualTo(new String[]{"u", "u"});


    }
}
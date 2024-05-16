import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DevideNineTest {

    @Test
    void solution() {
        DevideNine devideNine = new DevideNine();
        Assertions.assertThat(devideNine.solution("123")).isEqualTo(6);
        Assertions.assertThat(devideNine.solution("78720646226947352489")).isEqualTo(2);
    }
}
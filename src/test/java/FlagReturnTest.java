import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
class FlagReturnTest {

    @Test
    void solution() {
        FlagReturn flagReturn = new FlagReturn();
        Assertions.assertThat(flagReturn.solution(-4, 7, true)).isEqualTo(3);
        Assertions.assertThat(flagReturn.solution(-4, 7, false)).isEqualTo(-11);

    }
}
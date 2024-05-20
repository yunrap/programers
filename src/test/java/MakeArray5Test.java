import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MakeArray5Test {

    @Test
    void solution() {
        MakeArray5 makeArray5 = new MakeArray5();
        Assertions.assertThat(makeArray5.solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5)).isEqualTo(new int[]{56789, 99999});
    }
}
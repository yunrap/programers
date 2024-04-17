import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;


class QrCodeTest {

    @Test
    void solution() {
        QrCode qrCode = new QrCode();
        Assertions.assertThat(qrCode.solution(3,1,"qjnwezgrpirldywt")).isEqualTo("jerry");
        Assertions.assertThat(qrCode.solution(1,0,"programmers")).isEqualTo("programmers");
    }
}
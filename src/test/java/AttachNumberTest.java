import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;


class AttachNumberTest {

    @Test
    void solution() {
        AttachNumber attachNumber = new AttachNumber();
        Assertions.assertThat(attachNumber.solution(new int[]{3, 4, 5, 2, 1})).isEqualTo(393);
    }
}
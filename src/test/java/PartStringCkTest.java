import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class PartStringCkTest {

    @Test
    void solution() {
        PartStringCk partStringCk = new PartStringCk();
        Assertions.assertThat(partStringCk.solution("banana", "ana")).isEqualTo(1);
        Assertions.assertThat(partStringCk.solution("banana", "wxyz")).isEqualTo(0);
    }
}
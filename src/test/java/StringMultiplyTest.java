import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringMultiplyTest {

    @Test
    void solution() {
        StringMultiply stringMultiply = new StringMultiply();
        Assertions.assertThat(stringMultiply.solution("string" , 3)).isEqualTo("stringstringstring");
    }
}
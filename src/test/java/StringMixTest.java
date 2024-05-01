import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringMixTest {

    @Test
    void solution() {
        StringMix stringMix = new StringMix();
        Assertions.assertThat(stringMix.solution("aaaaa", "bbbbb")).isEqualTo("ababababab");
    }
}
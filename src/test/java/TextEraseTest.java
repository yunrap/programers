import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class TextEraseTest {

    @Test
    void solution() {
        TextErase textErase = new TextErase();
        Assertions.assertThat(textErase.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3})).isEqualTo("programmers");
    }
}
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class MosCharTest {

    @Test
    void solution() {
        MosChar mosChar = new MosChar();
        Assertions.assertThat(mosChar.solution(".... . .-.. .-.. ---")).isEqualTo("hello");
        Assertions.assertThat(mosChar.solution(".--. -.-- - .... --- -.")).isEqualTo("python");
    }
}
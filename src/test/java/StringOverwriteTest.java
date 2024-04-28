import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringOverwriteTest {

    @Test
    void solution() {
        StringOverwrite stringOverwrite = new StringOverwrite();
        Assertions.assertThat(stringOverwrite.solution("He11oWor1d", "lloWorl", 2)).isEqualTo("HelloWorld");
        Assertions.assertThat(stringOverwrite.solution("Program29b8UYP", "merS123", 7)).isEqualTo("ProgrammerS123");
    }
}
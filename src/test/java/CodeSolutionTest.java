import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class CodeSolutionTest {

    @Test
    void solution() {
        CodeSolution codeSolution = new CodeSolution();
        Assertions.assertThat(codeSolution.solution("abc1abc1abc")).isEqualTo("acbac");
    }
}
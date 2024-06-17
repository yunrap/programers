import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class AemphasisTest {

    @Test
    void solution() {
        Aemphasis aemphasis = new Aemphasis();
        Assertions.assertThat(aemphasis.solution("abstract algebra")).isEqualTo("AbstrAct AlgebrA");
    }
}
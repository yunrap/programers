import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NmorePlusTest {

    @Test
    void solution() {
        NmorePlus nmorePlus = new NmorePlus();
        Assertions.assertThat(nmorePlus.solution(new int[]{34, 5, 71, 29, 100, 34},123)).isEqualTo(139);

    }
}
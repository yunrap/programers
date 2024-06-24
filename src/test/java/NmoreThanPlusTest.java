import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NmoreThanPlusTest {

    @Test
    void solution() {
        NmoreThanPlus nmoreThanPlus = new NmoreThanPlus();
        Assertions.assertThat(nmoreThanPlus.solution(new int[]{34, 5, 71, 29, 100, 34}, 123)).isEqualTo(139);
        Assertions.assertThat(nmoreThanPlus.solution(new int[]{58, 44, 27, 10, 100}, 139)).isEqualTo(239);
    }
}
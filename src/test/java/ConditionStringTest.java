import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
class ConditionStringTest {

    @Test
    void solution() {
        ConditionString conditionString = new ConditionString();
        Assertions.assertThat(conditionString.solution("<", "=", 20,50)).isEqualTo(1);
        Assertions.assertThat(conditionString.solution(">", "!", 41,78)).isEqualTo(0);
        Assertions.assertThat(conditionString.solution(">", "=", 41,41)).isEqualTo(1);

    }
}
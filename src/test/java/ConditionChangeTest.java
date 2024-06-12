import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class ConditionChangeTest {

    @Test
    void solution() {
        ConditionChange conditionChange = new ConditionChange();
        Assertions.assertThat(conditionChange.solution(new int[]{1, 2, 3, 100, 99, 98},3)).isEqualTo(new int[] {3, 6, 9, 300, 297, 294});
        Assertions.assertThat(conditionChange.solution(new int[]{1, 2, 3, 100, 99, 98},2)).isEqualTo(new int[] {3, 4, 5, 102, 101, 100});
    }
}
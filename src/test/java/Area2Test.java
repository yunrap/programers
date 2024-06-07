import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class Area2Test {

    @Test
    void solution() {
        Area2 area2 = new Area2();
        Assertions.assertThat(area2.solution(new int[] {1, 2, 1, 4, 5, 2, 9})).isEqualTo(new int[]{2, 1, 4, 5, 2});
        Assertions.assertThat(area2.solution(new int[] {1, 2, 1})).isEqualTo(new int[]{2});
        Assertions.assertThat(area2.solution(new int[] {1, 1, 1})).isEqualTo(new int[]{-1});
    }
}
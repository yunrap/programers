import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class ArrayDeleteTest {

    @Test
    void solution() {
        ArrayDelete arrayDelete = new ArrayDelete();
        Assertions.assertThat(arrayDelete.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})).isEqualTo(new int[]{293, 395, 678});
        Assertions.assertThat(arrayDelete.solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43})).isEqualTo(new int[]{110, 66, 439, 785, 1});
    }
}
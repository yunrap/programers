import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class ArrayCompareTest {

    @Test
    void solution() {
        ArrayCompare arrayCompare = new ArrayCompare();
        Assertions.assertThat(arrayCompare.solution(new int[]{49, 13}, new int[]{70, 11, 2})).isEqualTo(-1);
        Assertions.assertThat(arrayCompare.solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36})).isEqualTo(1);
        Assertions.assertThat(arrayCompare.solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3})).isEqualTo(0);
    }
}
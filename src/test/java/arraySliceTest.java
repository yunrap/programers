import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class arraySliceTest {

    @Test
    void solution() {
        ArraySlice arraySlice = new ArraySlice();
        Assertions.assertThat(arraySlice.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2})).isEqualTo(new int[]{1, 2, 3});
    }
}
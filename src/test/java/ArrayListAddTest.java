import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class ArrayListAddTest {

    @Test
    void solution() {
        ArrayListAdd arrayListAdd = new ArrayListAdd();
        Assertions.assertThat(arrayListAdd.solution(new int[]{5, 1, 4})).isEqualTo(new int[]{5, 5, 5, 5, 5, 1, 4, 4, 4, 4});
        Assertions.assertThat(arrayListAdd.solution(new int[]{6, 6})).isEqualTo(new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6});
    }
}
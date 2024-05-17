import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MakeArray4Test {

    @Test
    void solution() {
        MakeArray4 makeArray4 = new MakeArray4();
        Assertions.assertThat(makeArray4.solution(new int[]{1, 4, 2, 5, 3})).isEqualTo(new int[]{1, 2, 3});
    }
}
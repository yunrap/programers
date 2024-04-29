import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class MakeArray1Test {

    @Test
    void solution() {
        MakeArray1 makeArray1 = new MakeArray1();
        Assertions.assertThat(makeArray1.solution(10, 3 )).isEqualTo(new int[]{3, 6, 9});
        Assertions.assertThat(makeArray1.solution(15, 5 )).isEqualTo(new int[]{5, 10, 15});
    }
}
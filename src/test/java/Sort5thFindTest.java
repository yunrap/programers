import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sort5thFindTest {

    @Test
    void solution() {
        Sort5thFind sort5thFind = new Sort5thFind();
        Assertions.assertThat(sort5thFind.solution(new int[]{12, 4, 15, 46, 38, 1, 14})).isEqualTo(new int[]{1, 4, 12, 14, 15});
    }
}
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HeightReadTest {

    @Test
    void solution() {
        HeightRead heightRead = new HeightRead();
        Assertions.assertThat(heightRead.solution("ihrhbakrfpndopljhygc",4,2)).isEqualTo("happy");
    }
}
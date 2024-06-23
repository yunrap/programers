import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Counts5Test {

    @Test
    void solution() {
        Counts5 counts5 = new Counts5();
        Assertions.assertThat(counts5.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})).isEqualTo(new String[]{"nami", "vex"});
    }
}
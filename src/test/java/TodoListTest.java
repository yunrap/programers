import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class TodoListTest {
    @Test
    void solution(){
        TodoList todoList = new TodoList();
        Assertions.assertThat(todoList.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false})).isEqualTo(new String[]{"practiceguitar", "studygraph"});

    }
}
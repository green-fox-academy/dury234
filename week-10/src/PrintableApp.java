import com.greenfoxacademy.printable.*;

public class PrintableApp {
    public static void main(String[] args) {
        TodoItem item1 = new TodoItem("Buy milk");
        TodoItem item2 = new TodoItem("Buy chocolate", Priority.HIGH);

        Todo todo = new Todo();
        todo.add(item1);
        todo.add(item2);

        Domino domino1 = new Domino(5, 7);
        Domino domino2 = new Domino(2, 1);

        Dominoes dominoes = new Dominoes();
        dominoes.add(domino1);
        dominoes.add(domino2);

        dominoes.printAllFields();
        System.out.println();
        todo.printAllFields();
        System.out.println();
        item1.finishTask();
        todo.printAllFields();
    }
}

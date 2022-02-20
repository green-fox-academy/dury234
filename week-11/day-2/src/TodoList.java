import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<TodoTask> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(TodoTask task) {
        tasks.add(task);
    }

    public void remove(int i) {
        tasks.remove(i - 1);
    }

    public TodoTask getTask(int number) {
        return tasks.get(number);
    }

    public int getNumberOfTasks() {
        return tasks.size();
    }

    public void printTasks() {
        if (tasks.size() == 0) {
            System.out.println("No todos for today! :)");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.print(i + " - ");
                tasks.get(i).printInfo();
            }
        }
    }

}

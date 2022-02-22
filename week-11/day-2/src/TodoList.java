import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoList {
    private List<TodoTask> tasks;

    public TodoList() throws IOException {
        tasks = new ArrayList<>();
        Path p = Paths.get("data.csv");
        try {
            List<String> temp = Files.readAllLines(p);
            for (int i = 0; i < temp.size(); i++) {
                List<String> splitted = List.of(temp.get(i).split(";"));
                if (splitted.get(0).equals("true")) {
                    tasks.add(new TodoTask(splitted.get(1), true));
                } else {
                    tasks.add(new TodoTask(splitted.get(1), false));
                }
            }
        } catch (IOException e) {
            Files.createFile(p);
        }
    }

    public void add(TodoTask task) throws IOException {
        tasks.add(task);
        try {
            task.writeToFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public void remove(int i) throws IOException {
        tasks.remove(i - 1);
        Files.writeString(Paths.get("data.csv"), "");
        for (TodoTask task : tasks) {
            task.writeToFile();
        }

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
                System.out.print(i + 1 + " - ");
                tasks.get(i).printInfo();
            }
        }
    }

    public void finishTaskN(int n) throws IOException {
        tasks.get(n - 1).finishTask();
        Files.writeString(Paths.get("data.csv"), "");
        for (TodoTask task : tasks) {
            task.writeToFile();
        }
    }

    public void noArgs() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================\n");
        System.out.println("Command line arguments:");
        System.out.println("    -l   Lists all the tasks");
        System.out.println("    -a   Adds a new task");
        System.out.println("    -r   Removes an task");
        System.out.println("    -c   Completes an task");
    }

}

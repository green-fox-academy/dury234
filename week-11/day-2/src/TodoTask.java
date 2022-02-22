import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TodoTask {
    private String taskDescrition;
    private Boolean isFinished = false;

    public TodoTask(String taskDescrition) {
        this.taskDescrition = taskDescrition;
    }

    public TodoTask(String taskDescrition, Boolean isFinished) {
        this.taskDescrition = taskDescrition;
        this.isFinished = isFinished;
    }

    public Boolean getIsFinished() {
        return isFinished;
    }

    public void finishTask() {
        isFinished = true;
    }

    public String getTaskDescrition() {
        return taskDescrition;
    }

    public void printInfo() {
        if (isFinished) {
            System.out.println("[X] " + taskDescrition);
        } else {
            System.out.println("[ ] " + taskDescrition);
        }
    }

    public void writeToFile() throws IOException {
        try {
            if (isFinished) {
                Files.writeString(Paths.get("data.csv"), "true;" + taskDescrition + "\r\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(Paths.get("data.csv"), "false;" + taskDescrition + "\r\n", StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }


}

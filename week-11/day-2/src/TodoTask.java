public class TodoTask {
    private String taskDescrition;
    private Boolean isFinished = false;

    public TodoTask(String taskDescrition) {
        this.taskDescrition = taskDescrition;
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
}

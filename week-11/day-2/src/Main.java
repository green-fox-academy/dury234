public class Main {

    public static boolean isNumeric(String strNum) {
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TodoList todo = new TodoList();
        TodoTask task1 = new TodoTask("Walk the dog");
        TodoTask task2 = new TodoTask("Buy milk");
        TodoTask task3 = new TodoTask("Do homework");

        todo.add(task1);
        todo.add(task2);
        todo.add(task3);

//        no args

        if (args.length == 0) {
            System.out.println("Command Line Todo application");
            System.out.println("=============================\n");
            System.out.println("Command line arguments:");
            System.out.println("    -l   Lists all the tasks");
            System.out.println("    -a   Adds a new task");
            System.out.println("    -r   Removes an task");
            System.out.println("    -c   Completes an task");
        } else {

//            -l

            if (args[0].equals("-l")) {
                todo.printTasks();
            }

//            -a

            if (args[0].equals("-a")) {
                if (args.length == 1) {
                    System.out.println("Unable to add: no task provided");
                } else
                    todo.add(new TodoTask(args[1]));
            }

//            -r

            if (args[0].equals("-r")) {
                if (args.length == 1) {
                    System.out.println("Unable to remove: no index provided");
                } else if (!isNumeric(args[1])) {
                    System.out.println("Unable to remove: index is not a number");
                } else if (Integer.parseInt(args[1]) > todo.getNumberOfTasks()) {
                    System.out.println("Unable to remove: index is out of bound");
                } else
                    todo.remove(Integer.parseInt(args[1]));
            }

            if (args[0].equals("-c")) {
                if (args.length == 1) {
                    System.out.println("Unable to check: no index provided");
                } else if (!isNumeric(args[1])) {
                    System.out.println("Unable to check: index is not a number");
                } else if (Integer.parseInt(args[1]) > todo.getNumberOfTasks()) {
                    System.out.println("Unable to check: index is out of bound");
                } else
                    todo.getTask(Integer.parseInt(args[1]) - 1).finishTask();
            }

        }
    }
}

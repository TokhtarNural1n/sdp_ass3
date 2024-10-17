package CPattern;

import CR.Task;

public class CompleteTaskCommand implements Command {
    private Task task;

    public CompleteTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Completing a task with priority: " + task.getPriority());
    }
}

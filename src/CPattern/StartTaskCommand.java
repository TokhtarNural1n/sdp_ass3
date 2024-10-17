package CPattern;

import CR.Task;

public class StartTaskCommand implements Command {
    private Task task;

    public StartTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Run task with priority: " + task.getPriority());
    }
}

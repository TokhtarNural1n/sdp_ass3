package CR;

class HighPriorityHandler extends TaskHandler {
    @Override
    public void handle(Task task) {
        if (task.getPriority() == Priority.HIGH) {
            System.out.println("Processing a high priority task.");
        } else {
            super.handle(task);
        }
    }
}

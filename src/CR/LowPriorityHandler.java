package CR;

class LowPriorityHandler extends TaskHandler {
    @Override
    public void handle(Task task) {
        if (task.getPriority() == Priority.LOW) {
            System.out.println("Processing a low priority task.");
        } else {
            super.handle(task);
        }
    }
}
package CR;

class MediumPriorityHandler extends TaskHandler {
    @Override
    public void handle(Task task) {
        if (task.getPriority() == Priority.MEDIUM) {
            System.out.println("Processing a medium priority task.");
        } else {
            super.handle(task);
        }
    }
}
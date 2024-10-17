package CR;

public abstract class TaskHandler implements Handler {
    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Task task) {
        if (nextHandler != null) {
            nextHandler.handle(task);
        }
    }
}
package CR;

interface Handler {
    void setNextHandler(Handler nextHandler);
    void handle(Task task);
}
package MPattern;

import CPattern.Command;
import CR.Task;

import java.util.logging.Handler;

interface Mediator {
    void registerHandler(Handler handler);
    void registerCommand(Command command);
    void process(Task task);
}

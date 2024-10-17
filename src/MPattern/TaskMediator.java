package MPattern;

import CPattern.Command;
import CPattern.CompleteTaskCommand;
import CPattern.StartTaskCommand;
import CR.Task;

import java.util.logging.Handler;

class TaskMediator implements Mediator {
    private Handler handlerChain;
    private Command startCommand;
    private Command completeCommand;

    @Override
    public void registerHandler(Handler handler) {
        if (handlerChain == null) {
            handlerChain = handler;
        } else {
            handlerChain.setNextHandler(handler);
        }
    }

    @Override
    public void registerCommand(Command command) {
        if (command instanceof StartTaskCommand) {
            this.startCommand = command;
        } else if (command instanceof CompleteTaskCommand) {
            this.completeCommand = command;
        }
    }

    @Override
    public void process(Task task) {
        if (handlerChain != null) {
            handlerChain.handle(task);
            if (startCommand != null) startCommand.execute();
            if (completeCommand != null) completeCommand.execute();
        }
    }
}
package vn.cqrstemplate.cqrs;

public abstract class CommandHandler<T extends CommandRequestData, I extends CommandResponseData> implements Handler<T, I> {
    public CommandHandler() {
    }
}

package vn.cqrstemplate.cqrs;

public class UnsupportedCommandHandler extends CommandHandler<CommandRequestData, CommandResponseData> {
    private static final UnsupportedCommandHandler INSTANCE = new UnsupportedCommandHandler();

    public UnsupportedCommandHandler() {
    }

    public static UnsupportedCommandHandler getInstance() {
        return INSTANCE;
    }

    public CommandResponseData handle(CommandRequestData requestData) {
        return null;
    }
}

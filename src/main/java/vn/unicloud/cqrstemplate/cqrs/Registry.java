package vn.unicloud.cqrstemplate.cqrs;


import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.core.GenericTypeResolver;
import org.springframework.stereotype.Component;

@Component
public class Registry {
    private static final Map<Class<? extends CommandRequestData>, CommandHandler> COMMAND_HANDLER_MAP = new HashMap();
    private static final Map<Class<? extends QueryRequestData>, QueryHandler> QUERY_HANDLER_MAP = new HashMap();
    private final ApplicationContext applicationContext;

    public Registry(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        this.initCommandHandlerBeans();
        this.initQueryHandlerBeans();
    }

    private void initCommandHandlerBeans() {
        String[] commandHandlerBeanNames = this.applicationContext.getBeanNamesForType(CommandHandler.class);
        String[] var2 = commandHandlerBeanNames;
        int var3 = commandHandlerBeanNames.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String commandHandlerBeanName = var2[var4];
            this.initCommandHandlerBean(commandHandlerBeanName);
        }

    }

    private void initQueryHandlerBeans() {
        String[] queryHandlerBeanNames = this.applicationContext.getBeanNamesForType(QueryHandler.class);
        String[] var2 = queryHandlerBeanNames;
        int var3 = queryHandlerBeanNames.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String queryHandlerBeanName = var2[var4];
            this.initQueryHandlerBean(queryHandlerBeanName);
        }

    }

    private void initCommandHandlerBean(String commandHandlerBeanName) {
        Class<?> handlerClass = this.applicationContext.getType(commandHandlerBeanName);
        Class<?>[] generics = GenericTypeResolver.resolveTypeArguments(handlerClass, CommandHandler.class);
        Class<?> commandType = generics[0];
        COMMAND_HANDLER_MAP.put((Class<? extends CommandRequestData>) commandType, (CommandHandler)this.applicationContext.getBean(commandHandlerBeanName));
    }

    private void initQueryHandlerBean(String queryHandlerBeanName) {
        Class<?> handlerClass = this.applicationContext.getType(queryHandlerBeanName);
        Class<?>[] generics = GenericTypeResolver.resolveTypeArguments(handlerClass, QueryHandler.class);
        Class<?> queryType = generics[0];
        QUERY_HANDLER_MAP.put((Class<? extends QueryRequestData>) queryType, (QueryHandler)this.applicationContext.getBean(queryHandlerBeanName));
    }

    public <R extends CommandRequestData> CommandHandler getCommandHandler(Class<R> requestCommandClass) {
        CommandHandler commandHandler = (CommandHandler)COMMAND_HANDLER_MAP.get(requestCommandClass);
        return (CommandHandler)(commandHandler == null ? UnsupportedCommandHandler.getInstance() : commandHandler);
    }

    public <R extends QueryRequestData> QueryHandler getQueryHandler(Class<R> requestQueryClass) {
        QueryHandler queryHandler = (QueryHandler)QUERY_HANDLER_MAP.get(requestQueryClass);
        return (QueryHandler)(queryHandler == null ? UnsupportedQueryHandler.getInstance() : queryHandler);
    }

}
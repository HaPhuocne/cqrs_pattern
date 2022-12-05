package vn.cqrstemplate.cqrs;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class SpringBus implements CqrsBus {
    private final Registry registry;

    public <T extends RequestData, I extends ResponseData> I execute(T requestData, Class<I> responseClass) {
        Handler handler = this.getHandler(requestData);
        return handler == null ? null : (I) handler.handle(requestData);
    }

    private <T extends RequestData> Handler getHandler(T requestData) {
        if (requestData instanceof CommandRequestData) {
            return this.registry.getCommandHandler(((CommandRequestData)requestData).getClass());
        } else {
            return requestData instanceof QueryRequestData ? this.registry.getQueryHandler(((QueryRequestData)requestData).getClass()) : null;
        }
    }

    public SpringBus(Registry registry) {
        this.registry = registry;
    }
}


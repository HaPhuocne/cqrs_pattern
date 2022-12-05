package vn.unicloud.cqrstemplate.cqrs;

public interface Handler<T extends RequestData, I extends ResponseData> {
    I handle(T var1);
}

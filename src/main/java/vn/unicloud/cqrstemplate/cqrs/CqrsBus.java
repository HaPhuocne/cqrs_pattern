package vn.unicloud.cqrstemplate.cqrs;

public interface CqrsBus {
    <T extends RequestData, I extends ResponseData> I execute(T var1, Class<I> var2);
}

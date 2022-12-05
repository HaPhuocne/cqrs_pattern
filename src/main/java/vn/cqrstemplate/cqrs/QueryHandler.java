package vn.cqrstemplate.cqrs;

public abstract class QueryHandler<T extends QueryRequestData, I extends QueryResponseData> implements Handler<T, I> {
    public QueryHandler() {
    }
}

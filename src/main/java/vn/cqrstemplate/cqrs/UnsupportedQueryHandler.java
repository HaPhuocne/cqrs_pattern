package vn.cqrstemplate.cqrs;

public class UnsupportedQueryHandler extends QueryHandler<QueryRequestData, QueryResponseData> {
    private static final UnsupportedQueryHandler INSTANCE = new UnsupportedQueryHandler();

    public UnsupportedQueryHandler() {
    }

    public static UnsupportedQueryHandler getInstance() {
        return INSTANCE;
    }

    public QueryResponseData handle(QueryRequestData requestData) {
        return null;
    }
}

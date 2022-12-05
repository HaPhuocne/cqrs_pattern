package vn.unicloud.cqrstemplate.cqrs;

public class RequestData {
    protected RequestData(RequestData.RequestDataBuilder<?, ?> b) {
    }

    public static RequestData.RequestDataBuilder<?, ?> builder() {
        return new RequestData.RequestDataBuilderImpl();
    }

    public RequestData() {
    }

    private static final class RequestDataBuilderImpl extends RequestData.RequestDataBuilder<RequestData, RequestData.RequestDataBuilderImpl> {
        private RequestDataBuilderImpl() {
        }

        protected RequestData.RequestDataBuilderImpl self() {
            return this;
        }

        public RequestData build() {
            return new RequestData(this);
        }
    }

    public abstract static class RequestDataBuilder<C extends RequestData, B extends RequestData.RequestDataBuilder<C, B>> {
        public RequestDataBuilder() {
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "RequestData.RequestDataBuilder()";
        }
    }
}

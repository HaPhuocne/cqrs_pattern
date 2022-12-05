package vn.cqrstemplate.cqrs;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CommandRequestData extends RequestData {
    @JsonIgnore
    private String accessToken;
    @JsonIgnore
    private String cifNo;

    protected CommandRequestData(CommandRequestData.CommandRequestDataBuilder<?, ?> b) {
        super(b);
        this.accessToken = b.accessToken;
        this.cifNo = b.cifNo;
    }

    public static CommandRequestData.CommandRequestDataBuilder<?, ?> builder() {
        return new CommandRequestData.CommandRequestDataBuilderImpl();
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getCifNo() {
        return this.cifNo;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CommandRequestData)) {
            return false;
        } else {
            CommandRequestData other = (CommandRequestData)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$accessToken = this.getAccessToken();
                Object other$accessToken = other.getAccessToken();
                if (this$accessToken == null) {
                    if (other$accessToken != null) {
                        return false;
                    }
                } else if (!this$accessToken.equals(other$accessToken)) {
                    return false;
                }

                Object this$cifNo = this.getCifNo();
                Object other$cifNo = other.getCifNo();
                if (this$cifNo == null) {
                    if (other$cifNo != null) {
                        return false;
                    }
                } else if (!this$cifNo.equals(other$cifNo)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof CommandRequestData;
    }

    public int hashCode() {
        int result = 1;
        Object $accessToken = this.getAccessToken();
        result = result * 59 + ($accessToken == null ? 43 : $accessToken.hashCode());
        Object $cifNo = this.getCifNo();
        result = result * 59 + ($cifNo == null ? 43 : $cifNo.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getAccessToken();
        return "CommandRequestData(accessToken=" + var10000 + ", cifNo=" + this.getCifNo() + ")";
    }

    public CommandRequestData() {
    }

    public CommandRequestData(String accessToken, String cifNo) {
        this.accessToken = accessToken;
        this.cifNo = cifNo;
    }

    private static final class CommandRequestDataBuilderImpl extends CommandRequestData.CommandRequestDataBuilder<CommandRequestData, CommandRequestData.CommandRequestDataBuilderImpl> {
        private CommandRequestDataBuilderImpl() {
        }

        protected CommandRequestData.CommandRequestDataBuilderImpl self() {
            return this;
        }

        public CommandRequestData build() {
            return new CommandRequestData(this);
        }
    }

    public abstract static class CommandRequestDataBuilder<C extends CommandRequestData, B extends CommandRequestData.CommandRequestDataBuilder<C, B>> extends RequestDataBuilder<C, B> {
        private String accessToken;
        private String cifNo;

        public CommandRequestDataBuilder() {
        }

        protected abstract B self();

        public abstract C build();

        public B accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this.self();
        }

        public B cifNo(String cifNo) {
            this.cifNo = cifNo;
            return this.self();
        }

        public String toString() {
            String var10000 = super.toString();
            return "CommandRequestData.CommandRequestDataBuilder(super=" + var10000 + ", accessToken=" + this.accessToken + ", cifNo=" + this.cifNo + ")";
        }
    }
}

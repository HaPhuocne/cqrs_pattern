package vn.unicloud.cqrstemplate.exception;

import vn.unicloud.cqrstemplate.enums.ResponseCode;

public class BusinessException extends RuntimeException {

    private final ResponseCode responseCode;

    public BusinessException(ResponseCode responseCode) {
        super(responseCode.getMessage());
        this.responseCode = responseCode;
    }

    public ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public String getMessage() {
        return this.responseCode == null ? "unknown" : this.responseCode.getMessage();
    }

    public int getCode() {
        return this.responseCode == null ? 1 : this.responseCode.getCode();
    }

}

package vn.unicloud.cqrstemplate.enums;

public enum ResponseCode {
    // Common
    SUCCESS(0,"Success"),
    FAILED(1,"Failed"),
    COMMON_ERROR(2, "Common Error"),
    INVALID_PARAM(3, "Invalid param"),
    INVALID_SESSION(4, "Invalid session"),

    // User
    EXISTED_EMAIL(100, "Existed email"),
    EXISTED_PHONE(101, "Existed phone"),
    OTP_WAS_EXPIRED(102, "OTP was expired"),
    ACCOUNT_DID_NOT_LINK(103, "Account did not link"),
    USER_NOT_FOUND(104, "User not found"),
    ;

    private final int code;
    private final String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

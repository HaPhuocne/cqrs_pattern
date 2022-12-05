package vn.unicloud.cqrstemplate.cqrs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse {

    private int code;
    private String message;

}

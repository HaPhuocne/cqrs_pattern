package vn.unicloud.cqrstemplate.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import vn.unicloud.cqrstemplate.cqrs.CommandResponseData;
import vn.unicloud.cqrstemplate.cqrs.QueryResponseData;
import vn.unicloud.cqrstemplate.cqrs.ResponseData;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetUserInfoResponse extends QueryResponseData {

    private String name;
    private int age;

}

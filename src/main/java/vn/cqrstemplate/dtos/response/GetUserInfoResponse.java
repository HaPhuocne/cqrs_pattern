package vn.cqrstemplate.dtos.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import vn.cqrstemplate.cqrs.QueryResponseData;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetUserInfoResponse extends QueryResponseData {

    private String name;
    private int age;

}

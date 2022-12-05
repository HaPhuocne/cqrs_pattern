package vn.cqrstemplate.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import vn.cqrstemplate.cqrs.QueryRequestData;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@ToString
public class GetUserInfoRequest extends QueryRequestData {

    private String userId;

}

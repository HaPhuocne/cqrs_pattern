package vn.unicloud.cqrstemplate.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import vn.unicloud.cqrstemplate.cqrs.QueryResponseData;
import vn.unicloud.cqrstemplate.entity.User;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class GetAllUserResponse extends QueryResponseData {
    private List<User> users;

}

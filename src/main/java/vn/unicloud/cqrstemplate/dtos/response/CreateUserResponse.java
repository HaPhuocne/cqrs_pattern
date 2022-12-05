package vn.unicloud.cqrstemplate.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import vn.unicloud.cqrstemplate.cqrs.CommandResponseData;
import vn.unicloud.cqrstemplate.entity.User;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class CreateUserResponse extends CommandResponseData {

    private User user;

}

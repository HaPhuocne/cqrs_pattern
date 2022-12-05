package vn.cqrstemplate.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import vn.cqrstemplate.entity.User;
import vn.cqrstemplate.cqrs.CommandResponseData;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class CreateUserResponse extends CommandResponseData {

    private User user;

}

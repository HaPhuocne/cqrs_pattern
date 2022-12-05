package vn.unicloud.cqrstemplate.controller.command;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import vn.unicloud.cqrstemplate.controller.command.interfaces.IUserCommandController;
import vn.unicloud.cqrstemplate.cqrs.BaseController;
import vn.unicloud.cqrstemplate.cqrs.ResponseBase;
import vn.unicloud.cqrstemplate.dtos.request.CreateUserRequest;
import vn.unicloud.cqrstemplate.dtos.response.CreateUserResponse;

@RestController
public class UserCommandController extends BaseController implements IUserCommandController {

    @Override
    public ResponseEntity<ResponseBase<CreateUserResponse>> createUser(CreateUserRequest createUserRequest) {
        return this.execute(createUserRequest, CreateUserResponse.class);
    }
}

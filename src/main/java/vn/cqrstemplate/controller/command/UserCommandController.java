package vn.cqrstemplate.controller.command;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import vn.cqrstemplate.controller.command.interfaces.IUserCommandController;
import vn.cqrstemplate.cqrs.BaseController;
import vn.cqrstemplate.cqrs.ResponseBase;
import vn.cqrstemplate.dtos.request.CreateUserRequest;
import vn.cqrstemplate.dtos.response.CreateUserResponse;

@RestController
public class UserCommandController extends BaseController implements IUserCommandController {

    @Override
    public ResponseEntity<ResponseBase<CreateUserResponse>> createUser(CreateUserRequest createUserRequest) {
        return this.execute(createUserRequest, CreateUserResponse.class);
    }
}

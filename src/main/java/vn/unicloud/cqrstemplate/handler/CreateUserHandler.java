package vn.unicloud.cqrstemplate.handler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.unicloud.cqrstemplate.cqrs.CommandHandler;
import vn.unicloud.cqrstemplate.dtos.request.CreateUserRequest;
import vn.unicloud.cqrstemplate.dtos.request.GetUserInfoRequest;
import vn.unicloud.cqrstemplate.dtos.response.CreateUserResponse;
import vn.unicloud.cqrstemplate.dtos.response.GetUserInfoResponse;
import vn.unicloud.cqrstemplate.service.interfaces.IUserService;

@Component
public class CreateUserHandler extends CommandHandler<CreateUserRequest, CreateUserResponse> {

    private final IUserService userService;

    @Autowired
    private ModelMapper mapper;

    public CreateUserHandler(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public CreateUserResponse handle(CreateUserRequest request) {
        return new CreateUserResponse(this.userService.createUser(request.getName(), request.getAge()));
    }
}

package vn.cqrstemplate.handler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.cqrstemplate.service.interfaces.IUserService;
import vn.cqrstemplate.cqrs.CommandHandler;
import vn.cqrstemplate.dtos.request.CreateUserRequest;
import vn.cqrstemplate.dtos.response.CreateUserResponse;

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

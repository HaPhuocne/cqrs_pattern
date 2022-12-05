package vn.cqrstemplate.handler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.cqrstemplate.dtos.response.GetAllUserResponse;
import vn.cqrstemplate.service.interfaces.IUserService;
import vn.cqrstemplate.cqrs.QueryHandler;
import vn.cqrstemplate.dtos.request.GetAllUserRequest;

@Component
public class GetAllUserHandler extends QueryHandler<GetAllUserRequest, GetAllUserResponse> {

    private final IUserService userService;

    @Autowired
    private ModelMapper mapper;

    public GetAllUserHandler(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public GetAllUserResponse handle(GetAllUserRequest request) {
        return new GetAllUserResponse(userService.getAll());
    }
}

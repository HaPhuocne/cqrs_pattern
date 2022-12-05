package vn.unicloud.cqrstemplate.handler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.unicloud.cqrstemplate.cqrs.QueryHandler;
import vn.unicloud.cqrstemplate.dtos.request.GetAllUserRequest;
import vn.unicloud.cqrstemplate.dtos.request.GetUserInfoRequest;
import vn.unicloud.cqrstemplate.dtos.response.GetAllUserResponse;
import vn.unicloud.cqrstemplate.dtos.response.GetUserInfoResponse;
import vn.unicloud.cqrstemplate.service.interfaces.IUserService;

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

package vn.cqrstemplate.handler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.cqrstemplate.service.interfaces.IUserService;
import vn.cqrstemplate.cqrs.QueryHandler;
import vn.cqrstemplate.dtos.request.GetUserInfoRequest;
import vn.cqrstemplate.dtos.response.GetUserInfoResponse;

@Component
public class GetUserInfoHandler extends QueryHandler<GetUserInfoRequest, GetUserInfoResponse> {

    private final IUserService userService;

    @Autowired
    private ModelMapper mapper;

    public GetUserInfoHandler(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public GetUserInfoResponse handle(GetUserInfoRequest request) {
        return mapper.map(this.userService.getUserInfo(request.getUserId()), GetUserInfoResponse.class);
    }
}

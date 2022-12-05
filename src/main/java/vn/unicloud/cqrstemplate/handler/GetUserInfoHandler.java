package vn.unicloud.cqrstemplate.handler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import vn.unicloud.cqrstemplate.cqrs.CommandHandler;
import vn.unicloud.cqrstemplate.cqrs.QueryHandler;
import vn.unicloud.cqrstemplate.cqrs.RequestData;
import vn.unicloud.cqrstemplate.dtos.request.GetUserInfoRequest;
import vn.unicloud.cqrstemplate.dtos.response.GetUserInfoResponse;
import vn.unicloud.cqrstemplate.service.interfaces.IUserService;

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

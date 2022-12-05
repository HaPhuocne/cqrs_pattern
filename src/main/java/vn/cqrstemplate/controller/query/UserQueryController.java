package vn.cqrstemplate.controller.query;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import vn.cqrstemplate.controller.query.interfaces.IUserQueryController;
import vn.cqrstemplate.dtos.response.GetAllUserResponse;
import vn.cqrstemplate.cqrs.BaseController;
import vn.cqrstemplate.cqrs.ResponseBase;
import vn.cqrstemplate.dtos.request.GetAllUserRequest;
import vn.cqrstemplate.dtos.request.GetUserInfoRequest;
import vn.cqrstemplate.dtos.response.GetUserInfoResponse;

@RestController
public class UserQueryController extends BaseController implements IUserQueryController {

    @Override
    public ResponseEntity<ResponseBase<GetUserInfoResponse>> getUserInfo(String id) {
        return this.execute(new GetUserInfoRequest(id), GetUserInfoResponse.class);
    }

    @Override
    public ResponseEntity<ResponseBase<GetAllUserResponse>> getAll() {
        return this.execute(new GetAllUserRequest(), GetAllUserResponse.class);
    }
}

package vn.unicloud.cqrstemplate.controller.query.interfaces;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.unicloud.cqrstemplate.cqrs.ResponseBase;
import vn.unicloud.cqrstemplate.dtos.request.GetUserInfoRequest;
import vn.unicloud.cqrstemplate.dtos.response.GetAllUserResponse;
import vn.unicloud.cqrstemplate.dtos.response.GetUserInfoResponse;

import javax.validation.Valid;

@Tag(name = "User Controller", description = "Thao tác với user")
@RequestMapping("/api/user")
public interface IUserQueryController {

    @Operation(
        summary = "API for generating OTP",
        description = "- API for generating OTP",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        }
    )
    @Parameters({
        @Parameter(name = "Authorization", in = ParameterIn.HEADER, required = true, hidden = true)
    })
    @GetMapping(value = "/v1/getUserInfo")
    ResponseEntity<ResponseBase<GetUserInfoResponse>> getUserInfo(@RequestParam String id);

    @Operation(
        summary = "Get All User",
        description = "- Get all user",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        }
    )
    @Parameters({
        @Parameter(name = "Authorization", in = ParameterIn.HEADER, required = true, hidden = true)
    })
    @GetMapping(value = "/v1/getAll")
    ResponseEntity<ResponseBase<GetAllUserResponse>> getAll();

}

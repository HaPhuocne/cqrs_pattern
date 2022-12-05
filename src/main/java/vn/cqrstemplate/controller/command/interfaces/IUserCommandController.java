package vn.cqrstemplate.controller.command.interfaces;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.cqrstemplate.cqrs.ResponseBase;
import vn.cqrstemplate.dtos.request.CreateUserRequest;
import vn.cqrstemplate.dtos.response.CreateUserResponse;

import javax.validation.Valid;

@Tag(name = "User Controller", description = "Thao tác với user")
@RequestMapping("/api/user")
public interface IUserCommandController {

    @Operation(
        summary = "API for creating new user",
        description = "- API for creating new user",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        }
    )
    @Parameters({
        @Parameter(name = "Authorization", in = ParameterIn.HEADER, required = true, hidden = true)
    })
    @PostMapping(value = "/v1/createUser")
    ResponseEntity<ResponseBase<CreateUserResponse>> createUser(@Valid @RequestBody CreateUserRequest createUserRequest);

}

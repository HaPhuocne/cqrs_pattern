package vn.cqrstemplate.dtos.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import vn.cqrstemplate.cqrs.CommandRequestData;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class CreateUserRequest extends CommandRequestData {

    private String name;
    private int age;

}

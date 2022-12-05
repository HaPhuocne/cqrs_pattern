package vn.unicloud.cqrstemplate.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class UserInfo {

    private String name;
    private int age;

}

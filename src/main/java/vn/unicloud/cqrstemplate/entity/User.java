package vn.unicloud.cqrstemplate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = User.COLLECTION_NAME)
@Getter
@Setter
@ToString
//@Builder
public class User {

    public static final String COLLECTION_NAME = "user";

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("age")
    private Integer age;

}

package vn.unicloud.cqrstemplate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vn.unicloud.cqrstemplate.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
}

package vn.cqrstemplate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vn.cqrstemplate.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
}

package vn.unicloud.cqrstemplate.service.interfaces;

import vn.unicloud.cqrstemplate.entity.User;
import vn.unicloud.cqrstemplate.model.UserInfo;

import java.util.List;

public interface IUserService {

    User getUserInfo(String userId);

    User createUser(String name, int age);

    List<User> getAll();
}

package vn.cqrstemplate.service.interfaces;

import vn.cqrstemplate.entity.User;

import java.util.List;

public interface IUserService {

    User getUserInfo(String userId);

    User createUser(String name, int age);

    List<User> getAll();
}

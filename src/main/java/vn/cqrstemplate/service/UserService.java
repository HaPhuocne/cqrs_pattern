package vn.cqrstemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.cqrstemplate.exception.BusinessException;
import vn.cqrstemplate.repository.UserRepository;
import vn.cqrstemplate.service.interfaces.IUserService;
import vn.cqrstemplate.entity.User;
import vn.cqrstemplate.enums.ResponseCode;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserInfo(String userId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            throw new BusinessException(ResponseCode.USER_NOT_FOUND);
        }
        return user;
    }

    @Override
    public User createUser(String name, int age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}

package vn.unicloud.cqrstemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.unicloud.cqrstemplate.entity.User;
import vn.unicloud.cqrstemplate.enums.ResponseCode;
import vn.unicloud.cqrstemplate.exception.BusinessException;
import vn.unicloud.cqrstemplate.model.UserInfo;
import vn.unicloud.cqrstemplate.repository.UserRepository;
import vn.unicloud.cqrstemplate.service.interfaces.IUserService;

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

package au.edu.sydney.womensworldcup.service.impl;

// UserService.java

import au.edu.sydney.womensworldcup.mapper.UserMapper;
import au.edu.sydney.womensworldcup.pojo.entity.User;
import au.edu.sydney.womensworldcup.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    public boolean validateUser(String username, String password) {
        User user = getUserByUsername(username);
        if (user != null) {
            return user.getPassword().equals(password);
        }
        return false;
    }
}

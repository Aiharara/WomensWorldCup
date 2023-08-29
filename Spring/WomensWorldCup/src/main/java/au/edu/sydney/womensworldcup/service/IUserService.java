package au.edu.sydney.womensworldcup.service;

import au.edu.sydney.womensworldcup.mapper.UserMapper;
import au.edu.sydney.womensworldcup.pojo.entity.User;

public interface IUserService {
    User getUserByUsername(String username);
    boolean validateUser(String username, String password);
}

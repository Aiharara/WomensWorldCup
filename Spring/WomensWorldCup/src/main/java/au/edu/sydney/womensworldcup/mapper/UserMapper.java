package au.edu.sydney.womensworldcup.mapper;

import au.edu.sydney.womensworldcup.pojo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM Users WHERE username = #{username}")
    User findByUsername(String username);
}

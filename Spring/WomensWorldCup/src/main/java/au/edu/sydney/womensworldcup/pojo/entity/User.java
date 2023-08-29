package au.edu.sydney.womensworldcup.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("Users")
@Data
public class User {
    @TableId(type = IdType.AUTO)
    private int userID;
    private String username;
    private String password;

    // Getters and Setters
}


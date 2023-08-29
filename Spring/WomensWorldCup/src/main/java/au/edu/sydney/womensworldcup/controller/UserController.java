package au.edu.sydney.womensworldcup.controller;


import au.edu.sydney.womensworldcup.pojo.entity.User;
import au.edu.sydney.womensworldcup.service.IUserService;
import au.edu.sydney.womensworldcup.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private IUserService userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (userService.validateUser(username, password)) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }

    @PostMapping(value = "/login/1", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestBody User user) {
        if (userService.validateUser(user.getUsername(), user.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}

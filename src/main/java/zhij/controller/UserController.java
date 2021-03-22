package zhij.controller;

import zhij.domain.User;
import zhij.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/addUser")
    @ResponseBody
    public User addUser(@RequestBody User user) {
        System.out.println(user);
        System.out.println(userService.addUser(user));
        return user;
    }

    @GetMapping(value = "/getUsers")
    @ResponseBody
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(value = "/getUserById")
    @ResponseBody
    public User getUserById(int id) {
        return userService.getUserById(id);
    }

}

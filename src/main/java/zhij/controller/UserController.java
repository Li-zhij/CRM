package zhij.controller;

import zhij.domain.User;
import zhij.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/addUser")
    @ResponseBody
    public Map<String,String> addUser(@RequestBody User user) {
        System.out.println(user);
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString().replaceAll("-", "");
        user.setId(id);
        int flag = userService.addUser(user);
        Map<String,String> result = new HashMap<>();
        if (flag == 1) {
            result.put("status", "success");
        } else {
            result.put("status", "fail");
        }
        return result;
    }

    @PostMapping(value = "/updateUser")
    @ResponseBody
    public Map<String,String> updateUser(@RequestBody User user) {
        System.out.println(user);
        int flag = userService.updateUser(user);
        Map<String,String> result = new HashMap<>();
        if (flag == 1) {
            result.put("status", "success");
        } else {
            result.put("status", "fail");
        }
        return result;
    }

    @PostMapping(value = "/deleteUser")
    @ResponseBody
    public Map<String,String> deleteUser(String id) {
        System.out.println(id);
        int flag = userService.deleteUser(id);
        Map<String,String> result = new HashMap<>();
        if (flag == 1) {
            result.put("status", "success");
        } else {
            result.put("status", "fail");
        }
        return result;
    }

    @GetMapping(value = "/getUsers")
    @ResponseBody
    @CrossOrigin
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(value = "/getUserById")
    @ResponseBody
    public User getUserById(String id) {
        return userService.getUserById(id);
    }

}

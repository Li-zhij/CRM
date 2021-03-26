package zhij.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import zhij.common.Result;
import zhij.common.ResultCode;
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
@Api(tags = "用户管理相关接口")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 登录验证
    @PostMapping(value = "/login")
    @ResponseBody
    @ApiOperation("登录验证接口")
    @ApiImplicitParam(name = "loginForm", value = "登录数据表单（包括账号、密码）", defaultValue = "{loginAct:12345,loginPwd:12345}", required = true)
    public Result login(@RequestBody Map<String, String> loginForm) {
        String loginAct = loginForm.get("loginAct");
        String loginPwd = loginForm.get("loginPwd");
        if ("".equals(loginAct) || "".equals(loginPwd)) {
            return new Result(ResultCode.PWD_OR_ACT_ERROR);
        }
        User user = userService.getUserByActAndPwd(loginAct, loginPwd);
        if (user == null) {
            return new Result(ResultCode.PWD_OR_ACT_ERROR);
        }
        if ("0".equals(user.getLockStatus())) {
            return new Result(ResultCode.USER_LOCKED);
        }
        return new Result(ResultCode.SUCCESS, user);
    }

    // 添加用户
    @PostMapping(value = "/addUser")
    @ResponseBody
    @ApiOperation("添加用户接口")
    public Result addUser(@RequestBody User user) {
        System.out.println(user);
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString().replaceAll("-", "");
        user.setId(id);
        int flag = userService.addUser(user);
        if (flag == 1) {
           return new Result(ResultCode.SUCCESS);
        } else {
           return new Result(ResultCode.FAIL);
        }
    }

    // 修改用户
    @PostMapping(value = "/updateUser")
    @ResponseBody
    @ApiOperation("修改用户信息接口")
    public Result updateUser(@RequestBody User user) {
        System.out.println(user);
        int flag = userService.updateUser(user);
        if (flag == 1) {
            return new Result(ResultCode.SUCCESS);
        } else {
            return new Result(ResultCode.FAIL);
        }
    }

    // 删除用户
    @PostMapping(value = "/deleteUser")
    @ResponseBody
    @ApiOperation("删除接口")
    @ApiImplicitParam(name = "id", value = "用户id", required = true)
    public Result deleteUser(String id) {
        System.out.println(id);
        int flag = userService.deleteUser(id);
        if (flag == 1) {
            return new Result(ResultCode.SUCCESS);
        } else {
            return new Result(ResultCode.USER_NOTFOUND);
        }
    }

    // 查询用户列表
    @GetMapping(value = "/getUsers")
    @ResponseBody
    @CrossOrigin
    @ApiOperation("查询用户列表接口")
    public Result getUsers() {
        return new Result(ResultCode.SUCCESS, userService.getUsers());
    }

    // 根据 id 查询用户
    @GetMapping(value = "/getUserById")
    @ResponseBody
    @ApiOperation("根据id查询用户接口")
    public Result getUserById(String id) {
        return new Result(ResultCode.SUCCESS, userService.getUserById(id));
    }

}

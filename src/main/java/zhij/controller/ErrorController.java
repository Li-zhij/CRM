package zhij.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import zhij.common.Result;
import zhij.common.ResultCode;

@Controller
@Api(tags = "错误处理相关接口")
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "登录错误处理接口")
    public Result loginError() {
        return new Result(ResultCode.UNAUTHENTICATED);
    }

}

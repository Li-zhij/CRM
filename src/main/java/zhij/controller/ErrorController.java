package zhij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zhij.common.Result;
import zhij.common.ResultCode;

@Controller
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/login")
    @ResponseBody
    public Result loginError() {
        return new Result(ResultCode.UNAUTHENTICATED);
    }

}

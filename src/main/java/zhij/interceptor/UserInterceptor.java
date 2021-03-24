package zhij.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import zhij.filter.ExcludeURL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器：验证用户是否登录
 */
public class UserInterceptor implements HandlerInterceptor {
    /**
     * 预处理方法（控制器方法执行之前执行）
     * @param handler   被拦截的控制器对象
     * @return  如果为 true 则继续，否则截断请求
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("pre");
        String user = (String) request.getHeader("token");
        if (user == null) { // 判断是否登录
            // 未登录，返回提示信息
            request.getRequestDispatcher("/error/login").forward(request, response);  // 转发
            return false;
        }
        return true;
    }

    /**
     * 后处理方法（控制器方法执行之后执行，且可以对控制器返回的 数据和视图 进行修改）
     * @param handler   被拦截的控制器对象
     * @param modelAndView  被拦截的控制器的返回值
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("post");
    }

    /**
     * 请求处理完成后执行（当视图处理完成后，对视图进行了 forward）
     * 一般做资源回收动作（close 创建的一些对象）
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("after");
    }
}

package zhij.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String user = (String) request.getSession().getAttribute("user");

        String requestURL = request.getRequestURL().toString();
        if (ExcludeURL.isFilter(requestURL)) {  // 判断是否拦截
            // 拦截
            if (user == null) { // 判断是否登录
                // 未登录，返回提示信息
                request.getRequestDispatcher("/error/login").forward(servletRequest, servletResponse);  // 转发
            } else {
                // 已登录，放行请求
                filterChain.doFilter(servletRequest, servletResponse);
            }
        } else {
            // 通过
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}

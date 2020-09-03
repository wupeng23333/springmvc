package com.wupeng.handler;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    //验证登录的用户信息
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("1111执行了preHandle");
        String loginName="";
        Object attr=request.getSession().getAttribute("name");
        if(attr!=null){
            loginName= (String) attr;
        }
        if(!"zs".equals(loginName)){
            request.getRequestDispatcher("/tips.jsp").forward(request,response);
            return false;
        }
        return true;
    }

}

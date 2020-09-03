package com.wupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//创建处理器对象
//@RequestMapping(value = "/user")
@Controller
public class MyController {
    @RequestMapping(value = "some.do")
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "欢迎使用springmvc！");
        mv.addObject("fun", "执行的是doSome方法");
        mv.setViewName("index.jsp");
        return mv;

    }
}

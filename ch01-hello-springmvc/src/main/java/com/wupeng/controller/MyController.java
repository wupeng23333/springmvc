package com.wupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//创建处理器对象

@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc！");
        //mv.setViewName("/show.jsp");
        //mv.setViewName("/WEB-INF/view/show.jsp")

        //配置视图解析器后
        mv.setViewName("show");
        return mv;

    }
}

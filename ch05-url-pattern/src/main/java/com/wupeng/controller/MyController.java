package com.wupeng.controller;

import com.wupeng.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


//创建处理器对象
@Controller
public class MyController {
    @RequestMapping(value = "/some")
    public ModelAndView doReturnView(String name, Integer age) {
       ModelAndView mv=new ModelAndView();
       mv.addObject("myname",name);
       mv.addObject("myage",age);
       mv.setViewName("show");
       return mv;
    }
}

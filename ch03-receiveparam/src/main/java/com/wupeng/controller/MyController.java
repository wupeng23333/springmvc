package com.wupeng.controller;

import com.wupeng.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//创建处理器对象
@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name, Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/other.do")
    public ModelAndView doOther(@RequestParam(value = "rname", required = false) String name,
                                @RequestParam(value = "rage", required = false) Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/receive.do")
    public ModelAndView doReceive(Student student) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", student.getName());
        mv.addObject("myage", student.getAge());
        mv.addObject("student",student);
        mv.setViewName("show");
        return mv;
    }
}

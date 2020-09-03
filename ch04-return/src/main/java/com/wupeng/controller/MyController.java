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
    @RequestMapping(value = "/returnString-view.do")
    public String doReturnView(String name, Integer age) {
        //逻辑视图名称，配置视图解析器
        return "show";
    }
    @RequestMapping(value = "/returnString-view2.do")
    public String doReturnView2(String name, Integer age) {
        //完整路径名称，不需要配置视图解析器
        return "WEB-INF/view/show.jsp";
    }

    @RequestMapping(value = "/returnStudentJson.do")
    @ResponseBody
    public List<Student> doReturn(String name, Integer age){
        List<Student> list=new ArrayList<>();
        Student student=new Student();
        student.setName("占山");
        student.setAge(15);
        list.add(student);
        student=new Student();
        student.setName("张三");
        student.setAge(23);
        list.add(student);
        return list;//转为Json对象
    }
    @RequestMapping(value = "/returnString.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doReturnString(){
        return "Hello SpringMVC!您好！";
    }
}

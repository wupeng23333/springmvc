package com.wupeng.service.impl;

import com.wupeng.dao.StudentDao;
import com.wupeng.domain.Student;
import com.wupeng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentServiceImpl")
public class StudentServiceImpl implements StudentService {
    //引用类型自动注入,@Autowired，@Resource
    @Autowired
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
      int nums=studentDao.insertStudent(student);
      return nums;
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.selectStudents();
    }
}

package com.service;

import com.dao.IStudentDao;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentDao  studentDao;

    public void registerStudent(Student student) {
        studentDao.saveStudent(student);

    }
}

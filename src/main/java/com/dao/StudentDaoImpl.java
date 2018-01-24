package com.dao;

import com.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImpl implements IStudentDao {

    @Autowired
    SessionFactory sessionFactory;


    public void saveStudent(Student student) {
        sessionFactory.openSession().save(student);
    //    sessionFactory.getCurrentSession().save(student);
        System.out.println("TEST");

    }
}

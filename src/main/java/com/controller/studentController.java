package com.controller;

import com.model.Student;
import com.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class studentController {
    @Autowired
    IStudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String student() {
        return "index";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestParam(value = "name")String name,
                       @RequestParam(value = "surname")String surname,
                       @RequestParam(value = "age") String age,
                       ModelMap modelMap)
                        {

        Student student=new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(Integer.parseInt(age));
        studentService.registerStudent(student);
        modelMap.addAttribute("student", student);
        return "result";

    }

}

package com.singam.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.singam.jview.DataView;
import com.singam.model.Student;
import com.singam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @JsonView(DataView.Detail.class)
    public Student getStudent(@PathVariable("id") String id){
        return  studentService.get(id);
    }
}

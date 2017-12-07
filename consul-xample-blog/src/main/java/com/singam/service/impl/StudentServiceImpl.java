package com.singam.service.impl;

import com.singam.model.Student;
import com.singam.repository.StudentRepository;
import com.singam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student get(String id) {
        return studentRepository.get(id);
    }
}

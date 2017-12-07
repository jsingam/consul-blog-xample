package com.singam.repository.impl;

import com.singam.model.Student;
import com.singam.repository.StudentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {


    public Student get(String id){
        return new Student("1","Singam",23,13,"xxxxxx");
    }
}

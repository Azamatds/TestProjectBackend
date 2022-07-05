package com.example.fullstackproject.service;

import com.example.fullstackproject.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

    public void deleteById(int id);
}

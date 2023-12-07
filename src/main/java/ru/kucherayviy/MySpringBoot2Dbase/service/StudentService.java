package ru.kucherayviy.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Repository;
import ru.kucherayviy.MySpringBoot2Dbase.entity.Student;

import java.util.List;

@Repository
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}

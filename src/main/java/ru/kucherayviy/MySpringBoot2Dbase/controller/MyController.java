package ru.kucherayviy.MySpringBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.kucherayviy.MySpringBoot2Dbase.entity.Discipline;
import ru.kucherayviy.MySpringBoot2Dbase.entity.Student;
import ru.kucherayviy.MySpringBoot2Dbase.service.DisciplineService;
import ru.kucherayviy.MySpringBoot2Dbase.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private DisciplineService disciplineService;

    @GetMapping("/students")
    public List<Student> allStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        Student student = studentService.getStudent(id);
        if (student == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "student not found");
        }

        return student;
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/disciplines")
    public List<Discipline> allDisciplines() {
        return disciplineService.getAllDisciplines();
    }

    @GetMapping("/disciplines/{id}")
    public Discipline getDiscipline(@PathVariable("id") int id) {
        Discipline discipline = disciplineService.getDiscipline(id);
        if (discipline == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "discipline not found");
        }

        return discipline;
    }
    @PostMapping("/disciplines")
    public Discipline saveDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }

    @PutMapping("/disciplines")
    public Discipline updateDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }

    @DeleteMapping("/disciplines/{id}")
    public void deleteDiscipline(@PathVariable("id") int id) {
        disciplineService.deleteDiscipline(id);
    }

}

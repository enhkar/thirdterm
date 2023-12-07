package ru.kucherayviy.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Repository;
import ru.kucherayviy.MySpringBoot2Dbase.entity.Discipline;

import java.util.List;

@Repository
public interface DisciplineService {
    List<Discipline> getAllDisciplines();

    Discipline saveDiscipline(Discipline Discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);

}

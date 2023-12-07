package ru.kucherayviy.MySpringBoot2Dbase.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.kucherayviy.MySpringBoot2Dbase.dao.DisciplineDAO;
import ru.kucherayviy.MySpringBoot2Dbase.entity.Discipline;

import java.util.List;

@Repository
public class DisciplineServiceImpl implements DisciplineService {

    @Autowired
    private DisciplineDAO DisciplineDAO;

    @Override
    @Transactional
    public List<Discipline> getAllDisciplines() {
        return DisciplineDAO.getAllDisciplines();
    }

    @Override
    @Transactional
    public Discipline saveDiscipline(Discipline Discipline) {
        return DisciplineDAO.saveDiscipline(Discipline);
    }

    @Override
    @Transactional
    public Discipline getDiscipline(int id) {
        return DisciplineDAO.getDiscipline(id);
    }

    @Override
    @Transactional
    public void deleteDiscipline(int id) {
        DisciplineDAO.deleteDiscipline(id);
    }
}

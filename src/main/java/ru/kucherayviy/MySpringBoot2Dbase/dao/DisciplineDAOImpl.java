package ru.kucherayviy.MySpringBoot2Dbase.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.kucherayviy.MySpringBoot2Dbase.entity.Discipline;

import java.util.List;

@Repository
@Slf4j
public class DisciplineDAOImpl implements DisciplineDAO {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Discipline> getAllDisciplines() {
        Query query = entityManager.createQuery("from Discipline");
        List<Discipline> allDiscipline = query.getResultList();
        log.info("all students: " + allDiscipline);
        return allDiscipline;
    }

    @Override
    public Discipline saveDiscipline(Discipline discipline) {
        return entityManager.merge(discipline);
    }

    @Override
    public Discipline getDiscipline(int id) {
        return entityManager.find(Discipline.class, id);
    }

    @Override
    public Discipline getDisciplineByName(String name) {
        return entityManager.find(Discipline.class, name);
    }

    @Override
    public void deleteDiscipline(int id) {
        Query query = entityManager.createQuery("delete from Discipline where id =:disciplineId");
        query.setParameter("disciplineId", id);
        query.executeUpdate();
    }
}

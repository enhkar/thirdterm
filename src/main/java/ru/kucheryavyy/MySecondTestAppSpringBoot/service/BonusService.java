package ru.kucheryavyy.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.kucheryavyy.MySecondTestAppSpringBoot.model.Positions;

@Service
public interface BonusService {

    double calculate(Positions position, double salary, double bonus, int workDays);
}

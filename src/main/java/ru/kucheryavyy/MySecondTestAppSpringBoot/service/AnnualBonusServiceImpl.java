package ru.kucheryavyy.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.kucheryavyy.MySecondTestAppSpringBoot.model.Positions;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService {
    @Override
    public double calculate(Positions position, double salary, double bonus, int workDays) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        return salary * bonus * getYearDays(year) * position.getPositionCoefficient() / workDays;
    }

    private int getYearDays(int year) {
        if (Year.of(year).isLeap()) {
            return 364;
        }
        return 365;
    }
}

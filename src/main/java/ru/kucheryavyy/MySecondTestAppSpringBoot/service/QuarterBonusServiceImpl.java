package ru.kucheryavyy.MySecondTestAppSpringBoot.service;

import ru.kucheryavyy.MySecondTestAppSpringBoot.model.Positions;

public class QuarterBonusServiceImpl implements QuarterBonusService{
    private final int QUARTER_COEFFICIENT = 3;
    private final int QUARTER_DAYS = 91;

    @Override
    public double calculate(Positions position, double salary, double bonus, int workDays) {
        if (!position.isManager())
            return 0;

        return salary * bonus * QUARTER_COEFFICIENT * getWorkDaysCoefficient(workDays);
    }

    private double getWorkDaysCoefficient(double worldDays) {
        if (worldDays < QUARTER_DAYS) {
            return worldDays / QUARTER_DAYS;
        }

        return 1;
    }
}

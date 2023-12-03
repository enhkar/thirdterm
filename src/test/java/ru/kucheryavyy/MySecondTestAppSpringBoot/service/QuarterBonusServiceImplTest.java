package ru.kucheryavyy.MySecondTestAppSpringBoot.service;

import org.junit.jupiter.api.Test;
import ru.kucheryavyy.MySecondTestAppSpringBoot.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class QuarterBonusServiceImplTest {

    @Test
    void calculate() {
        // given
        Positions position = Positions.TL;
        double bonus = 1.3;
        int workDays = 243;
        double salary = 220000.00;

        // when
        double result = new QuarterBonusServiceImpl().calculate(position, salary, bonus, workDays);

        // then
        double expected = 858000.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculateLessWorkDays() {
        // given
        Positions position = Positions.PM;
        double bonus = 1.0;
        int workDays = 70;
        double salary = 120000.00;

        // when
        double result = new QuarterBonusServiceImpl().calculate(position, salary, bonus, workDays);

        // then
        double expected = 276923.07692307694;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculateNotManager() {
        // given
        Positions position = Positions.DEV;
        double bonus = 2.0;
        int workDays = 365;
        double salary = 150000.00;

        // when
        double result = new QuarterBonusServiceImpl().calculate(position, salary, bonus, workDays);

        // then
        double expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
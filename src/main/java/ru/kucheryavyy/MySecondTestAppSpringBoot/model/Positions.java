package ru.kucheryavyy.MySecondTestAppSpringBoot.model;

import lombok.Getter;

@Getter
public enum Positions {
    DEV(2.2, false),
    HR(1.2, false),
    TL(2.6, true),
    QA(1.6, false),
    DS(2.2, false),
    PM(2.1, true);


    private final double positionCoefficient;

    private final boolean manager;

    Positions(double positionCoefficient, boolean manager) {
        this.positionCoefficient = positionCoefficient;
        this.manager = manager;
    }

    public boolean isManager() {
        return this.manager;
    }
}

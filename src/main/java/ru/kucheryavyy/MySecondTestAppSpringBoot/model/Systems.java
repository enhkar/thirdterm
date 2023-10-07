package ru.kucheryavyy.MySecondTestAppSpringBoot.model;

public enum Systems {

    ERP("Enterprise Resource Planning"),
    CRM("Customer Relationship Management"),
    WMS("Warehouse Management System");

    private final String name;

    Systems(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

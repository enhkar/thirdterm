package ru.kucheryavyy.MySecondTestAppSpringBoot.service;


import org.springframework.stereotype.Service;
import ru.kucheryavyy.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {

    void modify(Request request);
}

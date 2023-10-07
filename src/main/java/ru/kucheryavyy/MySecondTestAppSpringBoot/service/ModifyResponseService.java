package ru.kucheryavyy.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.kucheryavyy.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);

}

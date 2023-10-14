package ru.kucheryavyy.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.kucheryavyy.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);

}

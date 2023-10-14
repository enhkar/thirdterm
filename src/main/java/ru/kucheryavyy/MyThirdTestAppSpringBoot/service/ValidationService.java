package ru.kucheryavyy.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.kucheryavyy.MyThirdTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.kucheryavyy.MyThirdTestAppSpringBoot.exception.ValidationFailedException;

@Service
public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}

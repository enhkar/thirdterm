package ru.kucheryavyy.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.kucheryavyy.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.kucheryavyy.MySecondTestAppSpringBoot.exception.ValidationFailedException;

@Service
public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}

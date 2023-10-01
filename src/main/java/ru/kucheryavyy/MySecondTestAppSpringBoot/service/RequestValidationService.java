package ru.kucheryavyy.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.kucheryavyy.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.kucheryavyy.MySecondTestAppSpringBoot.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService{
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException {
        if (bindingResult.hasErrors()) {
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }

        String uid = (String) bindingResult.getRawFieldValue("uid");
        if (uid.equals("123")) {
            throw new UnsupportedCodeException("Uid can't be equal to '123'");
        }
    }
}

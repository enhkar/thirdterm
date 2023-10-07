package ru.kucheryavyy.MySecondTestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import ru.kucheryavyy.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.kucheryavyy.MySecondTestAppSpringBoot.exception.ValidationFailedException;

@Slf4j
@Service
public class RequestValidationService implements ValidationService{
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException {
        if (bindingResult.hasErrors()) {
            for (FieldError error: bindingResult.getFieldErrors()) {
                log.error("validationError: filed={}, message={}", error.getField(), error.getDefaultMessage());
            }
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }

        String uid = (String) bindingResult.getRawFieldValue("uid");
        if (uid.equals("123")) {
            log.error("Unsupported code error: invalid value {}", uid);
            throw new UnsupportedCodeException("invalid value");
        }
    }
}

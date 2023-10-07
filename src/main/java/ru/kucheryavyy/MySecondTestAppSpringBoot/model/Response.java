package ru.kucheryavyy.MySecondTestAppSpringBoot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    String uid;
    String operationUid;
    String systemTime;
    Codes code;
    ErrorCodes errorCode;
    ErrorMessages errorMessage;
}
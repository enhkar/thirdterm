package ru.kucheryavyy.MySecondTestAppSpringBoot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    /**
     * Уникальный идентификатор сообщения
     */
    String uid;
    /**
     * Уникальный идентификатор операции
     */
    String operationUid;
    /**
     * Имя системы отправителя
     */
    String systemTime;
    /**
     * Статус обработки сообщения
     */
    Codes code;
    /**
     * Наименование ресурса
     */
    ErrorCodes errorCode;
    /**
     * Сообщение об ошибке
     */
    ErrorMessages errorMessage;
}
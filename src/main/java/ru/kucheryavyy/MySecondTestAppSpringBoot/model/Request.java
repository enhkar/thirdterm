package ru.kucheryavyy.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {


    /**
     * Уникальный идентификатор сообщения
     */
    @NotBlank
    @Size(min = 1, max = 32)
    private String uid;

    /**
     * Уникальный идентификатор операции
     */
    @NotBlank
    @Size(min = 1, max = 32)
    private String operationUid;

    /**
     * Имя системы отправителя
     */
    @NotNull
    private String systemName;

    /**
     * Время создания сообщения
     */
    @NotBlank
    private String systemTime;

    /**
     * Наименование ресурса
     */
    private String source;

    /**
     * Должность
     */
    private Positions position;

    /**
     * Месячная сумма зарплаты
     */
    private double salary;

    /**
     * Дополнительно выплачиваемый бонус
     */
    private double bonus;

    /**
     * Количество отработанных дней
     */
    private int workDays;


    /**
     * Уникальный идентификатор коммуникации
     */
    @NotNull
    @Min(1)
    @Max(100000)
    private Integer communicationId;

    /**
     * Уникальный идентификатор шаблона
     */
    private int templateId;

    /**
     * Код продукта
     */
    private int productCode;

    /**
     * Смс код
     */
    private int smsCode;

    @Override
    public String toString() {
        return """
                 {uid='%s', operationUid='%s', systemName='%s', systemTime='%s', source='%s', \
                 communicationId='%d' templateId='%d', productCode='%d', smsCode='%d'}
                """.formatted(
                uid, operationUid, systemName, systemTime, source, communicationId, templateId, productCode, smsCode
        );
    }
}

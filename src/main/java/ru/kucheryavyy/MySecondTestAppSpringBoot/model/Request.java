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

    @NotBlank
    @Size(min = 1, max = 32)
    String uid;

    @NotBlank
    @Size(min = 1, max = 32)
    String operationUid;

    String systemName;

    @NotBlank
    String systemTime;

    String source;

    @NotNull
    @Min(1)
    @Max(100000)
    Integer communicationId;

    int templateId;

    int productCode;

    int smsCode;
}

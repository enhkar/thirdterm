package ru.kucheryavyy.MyThirdTestAppSpringBoot.model;

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

    @NotNull
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

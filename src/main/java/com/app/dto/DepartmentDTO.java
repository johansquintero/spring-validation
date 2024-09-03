package com.app.dto;

import com.app.advice.ErrorValidationMessages;
import com.app.advice.RegularExpressions;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    @Size(min = 3, max = 50)
    @Pattern(regexp = RegularExpressions.NOT_NUMERIC_EXPRESSION, message = ErrorValidationMessages.NOT_NUMERIC_MESAGGE)
    private String name;

    @Size(min = 3, max = 50)
    @Pattern(regexp = RegularExpressions.NOT_NUMERIC_EXPRESSION, message = ErrorValidationMessages.NOT_NUMERIC_MESAGGE)
    private String city;
}

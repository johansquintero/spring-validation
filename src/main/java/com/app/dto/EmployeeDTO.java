package com.app.dto;

import com.app.advice.ErrorValidationMessages;
import com.app.advice.RegularExpressions;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    @Size(min = 3, max = 50)
    @NotBlank(message = ErrorValidationMessages.NOT_BLANK_MESAGGE)
    @Pattern(regexp = RegularExpressions.NOT_NUMERIC_EXPRESSION, message = ErrorValidationMessages.NOT_NUMERIC_MESAGGE)
    private String name;

    @Size(min = 3, max = 50)
    @NotBlank(message = ErrorValidationMessages.NOT_BLANK_MESAGGE)
    @Pattern(regexp = RegularExpressions.NOT_NUMERIC_EXPRESSION, message = ErrorValidationMessages.NOT_NUMERIC_MESAGGE)
    private String lastName;

    @NotBlank(message = ErrorValidationMessages.NOT_BLANK_MESAGGE)
    @Pattern(regexp = RegularExpressions.EMAIL_EXPRESSION, message = ErrorValidationMessages.EMAIL_ERROR_MESSAGE)
    private String email;

    @Pattern(regexp = RegularExpressions.PHONE_NUMBER_EXPRESSION, message = ErrorValidationMessages.NOT_PHONE_NUMBER_MESSAGE)
    private String phone;

    @Min(value = 18, message = ErrorValidationMessages.AGE_ERROR_MESSAGE)
    private byte age;

    @Digits(integer = 2, fraction = 3, message = ErrorValidationMessages.HEIGTH_ERROR_MESSAGE)
    private double height;

    private boolean married;

    @Past(message = ErrorValidationMessages.PAST_DATE_ERROR_MESSAGE)
    //@future
    private LocalDate dateOfBirth;

    @Valid
    private DepartmentDTO departmentDTO;
}

//===================VALIDACIONES MAS COMUNES=====================
//@NotNull
//@NotBlank //no vacio y no nulo
//@NotEmpty //listas no vacias
//
//para numeros
//@Min()
//@Max()
//
//tamano de caracteres
//@Size(min =, max =)

//para fechas
//@Past
//@future

//@CreditCardNumber
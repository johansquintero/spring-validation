package com.app.advice;

public final class ErrorValidationMessages {
    public static final String NOT_BLANK_MESAGGE = "The field must not be blank";
    public static final String NOT_NUMERIC_MESAGGE = "The field must not have numbers";
    public static final String ONLY_NUMERIC_MESAGGE = "The field must be only numeric";
    public static final String AGE_ERROR_MESSAGE = "The field must be greater than or equal to 18";

    public static final String EMAIL_ERROR_MESSAGE = "The field must have the format 'name@domain.com'";
    public static final String NOT_PHONE_NUMBER_MESSAGE = """
            The phone number must have the following formats:
            123-456-7890
            (123) 456-7890
            +1 123 456 7890
            123.456.7890
            1234567890""";

    public static final String HEIGTH_ERROR_MESSAGE = "The field must be numeric with decimal with the following format xx.xxx";

    public static final String PAST_DATE_ERROR_MESSAGE = "The field date must be in past";
}

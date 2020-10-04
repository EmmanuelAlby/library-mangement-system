package com.cape.lib.management.system.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Pattern;

import static com.cape.lib.management.system.contants.LibraryManagementContants.ALHA_NUMERIC;
import static com.cape.lib.management.system.contants.LibraryManagementContants.VALIDATION_MESSAGE;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetails {

    @Pattern(regexp = ALHA_NUMERIC, message = VALIDATION_MESSAGE)
    private String firstName;
    @Pattern(regexp = ALHA_NUMERIC, message = VALIDATION_MESSAGE)
    private String lastName;
    @Pattern(regexp = ALHA_NUMERIC, message = VALIDATION_MESSAGE)
    private String emailId;
    @Pattern(regexp = ALHA_NUMERIC, message = VALIDATION_MESSAGE)
    private String age;
}

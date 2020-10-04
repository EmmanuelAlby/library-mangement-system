package com.cape.lib.management.system.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Pattern;

import static com.cape.lib.management.system.contants.LibraryManagementContants.ALHA_NUMERIC;
import static com.cape.lib.management.system.contants.LibraryManagementContants.VALIDATION_MESSAGE;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String firstName;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String lastName;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String emailId;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String userName;
    private String userPass;
    private String userLoginTime;
    private String userLastLoginTime;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(String userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public String getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(String userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }
}

package com.kozich.messenger.service.api.dto;


import com.kozich.messenger.dao.api.UserRole;

import java.time.LocalDate;

public class UserDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dayOfBirth;
    private String login;
    private String password;
    private LocalDate registrationDate;
    private UserRole role;

    public UserDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public UserDto setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public UserDto setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public UserDto setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public UserDto setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public UserRole getRole() {
        return role;
    }

    public UserDto setRole(UserRole role) {
        this.role = role;
        return this;
    }
}

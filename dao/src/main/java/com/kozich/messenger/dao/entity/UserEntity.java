package com.kozich.messenger.dao.entity;

import com.kozich.messenger.dao.api.UserRole;

import java.time.LocalDate;

public class UserEntity {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dayOfBirth;
    private String login;
    private String password;
    private LocalDate registrationDate;
    private UserRole role;

    public UserEntity() {
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public UserEntity setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public UserEntity setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public UserEntity setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public UserEntity setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public UserRole getRole() {
        return role;
    }

    public UserEntity setRole(UserRole role) {
        this.role = role;
        return this;
    }
}

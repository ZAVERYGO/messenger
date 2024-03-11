package com.kozich.voting.dao.entity;

public class UserEntity {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String dayOfBirth;
    private String login;
    private String password;
    private String registrationDate;
    private String role;

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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public UserEntity setDayOfBirth(String dayOfBirth) {
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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public UserEntity setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public String getRole() {
        return role;
    }

    public UserEntity setRole(String role) {
        this.role = role;
        return this;
    }
}

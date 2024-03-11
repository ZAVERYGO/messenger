package com.kozich.voting.service.api.dto;


public class UserDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String dayOfBirth;
    private String login;
    private String password;
    private String registrationDate;
    private String role;

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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public UserDto setDayOfBirth(String dayOfBirth) {
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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public UserDto setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public String getRole() {
        return role;
    }

    public UserDto setRole(String role) {
        this.role = role;
        return this;
    }
}

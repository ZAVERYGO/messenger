package com.kozich.voting.service.BusinessObj;

public class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String dayOfBirth;
    private String login;
    private String password;
    private String registrationDate;
    private String role;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public User setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public User setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public User setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public String getRole() {
        return role;
    }

    public User setRole(String role) {
        this.role = role;
        return this;
    }

}

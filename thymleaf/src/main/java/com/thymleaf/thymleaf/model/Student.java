package com.thymleaf.thymleaf.model;

public class Student {
    private String firstName;
    private String lastName;
    private  String email;
    private String country;
    private  String favouriteLanguage;
    private  String favouriteOperatingSystem;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, String country, String favouriteLanguage, String favouriteOperatingSystem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.favouriteLanguage = favouriteLanguage;
        this.favouriteOperatingSystem = favouriteOperatingSystem;
    }






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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getFavouriteOperatingSystem() {
        return favouriteOperatingSystem;
    }

    public void setFavouriteOperatingSystem(String favouriteOperatingSystem) {
        this.favouriteOperatingSystem = favouriteOperatingSystem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", favouriteLanguage='" + favouriteLanguage + '\'' +
                ", favouriteOperatingSystem='" + favouriteOperatingSystem + '\'' +
                '}';
    }
}

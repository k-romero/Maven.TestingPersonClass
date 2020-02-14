package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private boolean citizen;
    private int phoneNumber;
    private boolean lookingForWork;
    private String educationLevel;

    public Person() {
        this.name ="";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }

    public Person(String name, int age, String gender, boolean citizen) {
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.citizen = citizen;
    }

    public Person(String name, int age, String gender, boolean citizen, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.citizen = citizen;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, int age, String gender, boolean citizen, int phoneNumber, boolean lookingForWork) {
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.citizen = citizen;
        this.phoneNumber = phoneNumber;
        this.lookingForWork = lookingForWork;
    }

    public Person(String name, int age, String gender, boolean citizen, int phoneNumber, boolean lookingForWork, String educationLevel) {
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.citizen = citizen;
        this.phoneNumber = phoneNumber;
        this.lookingForWork = lookingForWork;
        this.educationLevel = educationLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isCitizen() {
        return citizen;
    }

    public void setCitizen(boolean citizen) {
        this.citizen = citizen;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isLookingForWork() {
        return lookingForWork;
    }

    public void setLookingForWork(boolean lookingForWork) {
        this.lookingForWork = lookingForWork;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }
}

package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFullDetailsName() {
        // Given
        String expected = "Kevin";
        int age = 31;
        String gender = "M";
        boolean citizen = true;
        int phoneNumber = 3025555;
        boolean lookingForWork = true;
        String educationLevel = "Zipcode";

        //Instantiate new person
        Person person = new Person(expected, age, gender, citizen,phoneNumber,lookingForWork,educationLevel);

        // When
        person.setName(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFullDetailsAge() {
        // Given
        String name = "Kevin";
        int expected = 31;
        String gender = "M";
        boolean citizen = true;
        int phoneNumber = 3025555;
        boolean lookingForWork = true;
        String educationLevel = "Zipcode";

        //Instantiate new person
        Person person = new Person(name, expected, gender, citizen,phoneNumber,lookingForWork,educationLevel);

        // When
        person.setAge(expected);

        // Then
        int actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFullDetailsGender() {
        // Given
        String name = "Kevin";
        int age = 31;
        String expected = "M";
        boolean citizen = true;
        int phoneNumber = 3025555;
        boolean lookingForWork = true;
        String educationLevel = "Zipcode";

        //Instantiate new person
        Person person = new Person(name, age, expected, citizen,phoneNumber,lookingForWork,educationLevel);

        // When
        person.setGender(expected);

        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFullDetailsCitizen() {
        // Given
        String name = "Kevin";
        int age = 31;
        String gender = "M";
        boolean expected = true;
        int phoneNumber = 3025555;
        boolean lookingForWork = true;
        String educationLevel = "Zipcode";

        //Instantiate new person
        Person person = new Person(name, age, gender, expected,phoneNumber,lookingForWork,educationLevel);

        // When
        person.setCitizen(expected);

        // Then
        boolean actual = person.isCitizen();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFullDetailsPhone() {
        // Given
        String name = "Kevin";
        int age = 31;
        String gender = "M";
        boolean citizen = true;
        int expected = 3025555;
        boolean lookingForWork = true;
        String educationLevel = "Zipcode";

        //Instantiate new person
        Person person = new Person(name, age, gender, citizen, expected, lookingForWork,educationLevel);

        // When
        person.setPhoneNumber(expected);

        // Then
        boolean actual = person.isCitizen();
        Assert.assertEquals(expected, actual);
    }

}

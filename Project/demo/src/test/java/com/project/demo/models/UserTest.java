package com.project.demo.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void getId() {
        Long expectedId = 1L;
        User user = new User();
        user.setId(expectedId);
        Long actualId = user.getId();
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    void setId() {
        User user = new User();
        Long id = 1L;
        user.setId(id);
        Assertions.assertEquals(id, user.getId());

    }

    @Test
    void getName() {
        String expectedName = "John";
        User user = new User();
        user.setName(expectedName);
        String actualName = user.getName();
        Assertions.assertEquals(expectedName, actualName);

    }

    @Test
    void setName() {
        User user = new User();

        String name = "John Doe";
        user.setName(name);
        Assertions.assertEquals(name, user.getName());
    }

    @Test
    void getEmail() {
        String expectedEmail = "john@example.com";
        User user = new User();
        user.setEmail(expectedEmail);
        String actualEmail = user.getEmail();
        Assertions.assertEquals(expectedEmail, actualEmail);
    }

    @Test
    void setEmail() {
        User user = new User();
        String email = "johndoe@example.com";
        user.setEmail(email);
        Assertions.assertEquals(email, user.getEmail());
    }
}
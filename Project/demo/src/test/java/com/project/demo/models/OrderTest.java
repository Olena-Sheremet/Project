package com.project.demo.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void getId() {
        Long expectedId = 1L;
        Order order=new Order();
        order.setId(expectedId);
        Long actualId = order.getId();
        Assertions.assertEquals(expectedId, actualId);

    }

    @Test
    void setId() {
        Order order=new Order();
        Long id = 1L;
        order.setId(id);
        Assertions.assertEquals(id, order.getId());
    }

    @Test
    void getUser() {
        User expectedUser = new User();
        expectedUser.setId(123L);
        Order order=new Order();
        order.setUser(expectedUser);
        User actualUser = order.getUser();
        Assertions.assertEquals(expectedUser, actualUser);
    }

    @Test
    void setUser() {
        User expectedUser = new User();
        expectedUser.setId(123L);
        Order order=new Order();
        order.setUser(expectedUser);
        Assertions.assertEquals(expectedUser, order.getUser());
    }
}
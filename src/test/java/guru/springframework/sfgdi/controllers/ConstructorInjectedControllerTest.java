package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceCzechImpl;
import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controllerEN;
    ConstructorInjectedController controllerCZ;

    @BeforeEach
    void setUp() {
        controllerEN = new ConstructorInjectedController(new GreetingServiceImpl());
        controllerCZ = new ConstructorInjectedController(new GreetingServiceCzechImpl());
    }

    @Test
    void getGreeting() {
        assert controllerEN.getGreeting().equals("Hello World");
    }

    @Test
    void getGreetingCZ() {
        assert controllerCZ.getGreeting().equals("Ahoj!");
    }
}
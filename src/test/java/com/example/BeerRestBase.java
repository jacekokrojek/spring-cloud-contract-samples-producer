package com.example;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BeerRestBase {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new ProducerController(null));
    }

}
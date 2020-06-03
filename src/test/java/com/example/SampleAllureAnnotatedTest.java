package com.example;

import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;

public class SampleAllureAnnotatedTest {

    @Test
    @Description("My passing test once more")
    public void should_pass_once_more(){
        Assert.assertTrue(true);
    }

    @Test
    @Description("My failing test")
    public void should_fail(){
        Assert.assertTrue(true);
    }
}

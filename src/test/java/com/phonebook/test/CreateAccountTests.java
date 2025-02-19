package com.phonebook.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTests extends TestBase{
    @Test(enabled = false)
    public void createNewAccountPositiveTest(){
        Random random = new Random();
        int i = random.nextInt(1000) + 1000;
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "pamparampa" + i + "@gm.com");
        type(By.name("password"), "govnovoZZ228$");
        click(By.cssSelector("[name='registration']"));
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));


    }

    @Test
    public void createNewAccountNegativeTest(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "pamparampa@gm.com");
        type(By.name("password"), "govnovoZZ228$");
        click(By.cssSelector("[name='registration']"));
        Assert.assertTrue(isAlertPresent());


    }

}

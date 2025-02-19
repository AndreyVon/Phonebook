package com.phonebook.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void loginPositiveTest(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "pamparampa@gm.com");
        type(By.name("password"), "govnovoZZ228$");
        click(By.cssSelector("[name='login']"));
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }
}

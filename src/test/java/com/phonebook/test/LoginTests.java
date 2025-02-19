package com.phonebook.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void loginPositiveTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("pamparampa@gm.com")
                .setPassword("govnovoZZ228$"));
        clickOnLoginButton();
        Assert.assertTrue(isSignOutButtonPresent());
    }
    @Test
    public void loginNegativeTestWithoutEmail(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setPassword("govnovoZZ228$"));
        clickOnLoginButton();
        Assert.assertTrue(isAlertPresent());
    }

}

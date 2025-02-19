package com.phonebook.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test(enabled = false)
    public void createNewAccountPositiveTest(){

        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("pamparampa@gm.com")
                .setPassword("govnovoZZ228$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSignOutButtonPresent());


    }

    @Test
    public void createNewAccountNegativeTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("pamparampa@gm.com")
                .setPassword("govnovoZZ228$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());


    }

}

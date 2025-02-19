package com.phonebook.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("pamparampa@gm.com")
                .setPassword("govnovoZZ228$"));
        clickOnLoginButton();
    }

    @Test
    public void AddContactPositiveTest(){
        clickOnAddLink();
        fillAddContactForm(new Contact()
                .setName("Karhhl")
                .setLastName("Kirov")
                .setPhone("98787676543")
                .setEmail("ystal@gmail.com")
                .setAddress("tuevakukueva 18")
                .setDescription("chto to"));
        clickOnSaveButton();
        Assert.assertTrue(isContactCreated("Karhhl"));
    }

    @AfterMethod
    public void postConditions(){
        removeContact();
    }


}

package com.phonebook.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("pamparampa@gm.com")
                .setPassword("govnovoZZ228$"));
        clickOnLoginButton();

        clickOnAddLink();
        fillAddContactForm(new Contact()
                .setName("Karhhl")
                .setLastName("Kirov")
                .setPhone("98787676543")
                .setEmail("ystal@gmail.com")
                .setAddress("tuevakukueva 18")
                .setDescription("chto to"));
        clickOnSaveButton();
    }

    @Test
    public void deleteContactPositiveTest(){
        int sizeBefore = sizeOfContacts();
        removeContact();
        pause(800);
        int sizeAfter = sizeOfContacts();
        Assert.assertEquals(sizeAfter, sizeBefore-1);
    }

}

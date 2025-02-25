package com.phonebook.test;

import com.phonebook.models.Contact;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new User().setEmail("pamparampa@gm.com")
                .setPassword("govnovoZZ228$"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void AddContactPositiveTest(){
        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName("Karhhl")
                .setLastName("Kirov")
                .setPhone("98787676543")
                .setEmail("ystal@gmail.com")
                .setAddress("tuevakukueva 18")
                .setDescription("chto to"));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated("Karhhl"));
    }

    @AfterMethod
    public void postConditions(){
        app.getContact().removeContact();
    }


}

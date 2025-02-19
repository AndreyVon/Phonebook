package com.phonebook.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "pamparampa@gm.com");
        type(By.name("password"), "govnovoZZ228$");
        click(By.cssSelector("[name='login']"));
    }

    @Test
    public void AddContactPositiveTest(){
        click(By.cssSelector("[href='/add']"));
        type(By.cssSelector("input:nth-child(1)"),"Karl");
        type(By.cssSelector("input:nth-child(2)"),"Kirov");
        type(By.cssSelector("input:nth-child(3)"),"98787676543");
        type(By.cssSelector("input:nth-child(4)"),"ystal@gmail.com");
        type(By.cssSelector("input:nth-child(5)"),"tuevakukueva 18");
        type(By.cssSelector("input:nth-child(6)"),"chto to");
    }
}

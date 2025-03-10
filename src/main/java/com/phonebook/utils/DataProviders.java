package com.phonebook.utils;

import com.phonebook.models.Contact;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> addNewContactFromCsvFile() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contact.csv")));

        String line = reader.readLine();

        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new Contact().setName(split[0]).setLastName(split[1]).setPhone(split[2]).setEmail(split[3]).setAddress(split[4]).setDescription(split[5])});
            line = reader.readLine();
        }


        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> addNewContact(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Oliver","Kan","1254657656","test1@gmail.com","Munich","goalkeeper"});
        list.add(new Object[]{"Oliver2","Man","6456475454","test2@gmail.com", "Munich","goalkeeper"});
        list.add(new Object[]{"Oliver3","Pun","2357755323","test3@gmail.com", "Munich","goalkeeper"});

        return list.iterator();
    }
}

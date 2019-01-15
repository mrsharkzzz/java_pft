package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase{

    @Test

    public void testContactCreation(){

        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Вася","Пупкин","test1"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returntoHomePage();


    }

}

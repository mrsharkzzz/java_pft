package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTests extends TestBase {

    @Test

    public void testContactModification() {

        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Пузырь", "cddc",null));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returntoHomePage();

    }

}

package dao;

import models.ContactUs;

import java.util.List;

public interface ContactUsDao {


    List<ContactUs> getContactUs;
    ContactUs ContactUsById(int id);



    void addContactUs(ContactUs contactUs);

    void deleteContactUsById(int id);

    void deleteAllContactUs();


}

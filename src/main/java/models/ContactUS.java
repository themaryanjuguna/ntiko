package models;

import java.util.Objects;

public class ContactUS {
    private int contactUsId;
    private String Name;
    private int phoneNumber;
    private String Email;
    private String Message;

    public ContactUS(int contactUsId, String name, int phoneNumber, String email, String message) {
        this.contactUsId = contactUsId;
        Name = name;
        this.phoneNumber = phoneNumber;
        Email = email;
        Message = message;
    }

    public int getContactUsId() {
        return contactUsId;
    }

    public void setContactUsId(int contactUsId) {
        this.contactUsId = contactUsId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactUS)) return false;
        ContactUS contactUS = (ContactUS) o;
        return contactUsId == contactUS.contactUsId && phoneNumber == contactUS.phoneNumber && Objects.equals(Name, contactUS.Name) && Objects.equals(Email, contactUS.Email) && Objects.equals(Message, contactUS.Message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactUsId, Name, phoneNumber, Email, Message);
    }
}

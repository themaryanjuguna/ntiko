package models;

import java.util.Objects;

public class EventOrganisers {
    private int eventOrganiserId;
    private String Name;
    private String telephoneNumber;
    private String Email;

    public EventOrganisers(int eventOrganiserId, String name, String telephoneNumber, String email) {
        this.eventOrganiserId = eventOrganiserId;
        Name = name;
        this.telephoneNumber = telephoneNumber;
        Email = email;
    }

    public int getEventOrganiserId() {
        return eventOrganiserId;
    }

    public void setEventOrganiserId(int eventOrganiserId) {
        this.eventOrganiserId = eventOrganiserId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventOrganisers)) return false;
        EventOrganisers that = (EventOrganisers) o;
        return eventOrganiserId == that.eventOrganiserId && Objects.equals(Name, that.Name) && Objects.equals(telephoneNumber, that.telephoneNumber) && Objects.equals(Email, that.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventOrganiserId, Name, telephoneNumber, Email);
    }
}

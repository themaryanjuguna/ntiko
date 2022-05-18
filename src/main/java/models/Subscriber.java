package models;

import java.util.Objects;

public class Subscriber {
    private String Name;
    private String Email;
    private int phoneNumber;
    private int eventid;
    private int subscriberId;
    private int Quantity;
    private double Total;

    public Subscriber(String name, String email, int phoneNumber, int eventid, int subscriberId, int quantity, double total) {
        Name = name;
        Email = email;
        this.phoneNumber = phoneNumber;
        this.eventid = eventid;
        this.subscriberId = subscriberId;
        Quantity = quantity;
        Total = total;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber)) return false;
        Subscriber that = (Subscriber) o;
        return phoneNumber == that.phoneNumber && eventid == that.eventid && subscriberId == that.subscriberId && Quantity == that.Quantity && Double.compare(that.Total, Total) == 0 && Objects.equals(Name, that.Name) && Objects.equals(Email, that.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Email, phoneNumber, eventid, subscriberId, Quantity, Total);
    }
}

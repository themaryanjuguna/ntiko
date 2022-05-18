package models;

import java.util.Objects;

public class Events {
    private int eventId;
    private int eventOrganiserId;
    private double Price;
    private String EventName;

    public Events(int eventId, int eventOrganiserId, double price, String eventName) {
        this.eventId = eventId;
        this.eventOrganiserId = eventOrganiserId;
        Price = price;
        EventName = eventName;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getEventOrganiserId() {
        return eventOrganiserId;
    }

    public void setEventOrganiserId(int eventOrganiserId) {
        this.eventOrganiserId = eventOrganiserId;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Events)) return false;
        Events events = (Events) o;
        return eventId == events.eventId && eventOrganiserId == events.eventOrganiserId && Double.compare(events.Price, Price) == 0 && Objects.equals(EventName, events.EventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventOrganiserId, Price, EventName);
    }
}

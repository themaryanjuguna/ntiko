package models;

import java.util.Objects;

public class Tickets {
    private int ticketId;
    private int eventId;
    private String Type;
    private String Status;

    public Tickets(int ticketId, int eventId, String type, String status) {
        this.ticketId = ticketId;
        this.eventId = eventId;
        Type = type;
        Status = status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tickets)) return false;
        Tickets tickets = (Tickets) o;
        return ticketId == tickets.ticketId && eventId == tickets.eventId && Objects.equals(Type, tickets.Type) && Objects.equals(Status, tickets.Status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, eventId, Type, Status);
    }
}

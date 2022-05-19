package dao;

import models.Tickets;
import java.util.List;


public interface TicketsDao {
    //CRUD
    List<Ticketss> getAllTickets();
    void addTickets(Tickets tickets);
    Events findTicketsById(int id);
    void deleteTicketsById(int id);
    void deleteAllTickets();



}
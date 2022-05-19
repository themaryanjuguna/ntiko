package dao;

import models.Ticket;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oTicketrDao implements TicketDao {

    public List<Ticket> getAllTicket() {
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(" SELECT * FROM Ticket")
                    .executeAndFetch(Ticket.class);
        }
    }

    public void addTicket(Ticket ticket){
        String sql = "INSERT INTO Ticket(TicketId ,eventId, Type , status VALUES (  :TicketId, :eventId, :Type, :status,  now())";
        try(Connection con = DB.sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(Ticket)
                    .executeUpdate()
                    .getKey();
            Ticket.setId(id);
        } catch (Sql2oException e){
            System.out.println("e");
        }


    }

    public Ticket findTicketById(int id) {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM Ticket WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Ticket.class);
        }

    }

    public void deleteTicketById(int id) {

        String sql = "DELETE FROM Ticket WHERE id = :id";
        try (Connection con = DB.sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    public void deleteAllTicket() {
        String sql = "DELETE FROM Ticket";
        try(Connection con = DB.sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();

        } catch (Sql2oException e){
            System.out.println("e");
        }


    }


}
package dao;

import models.Events;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oEventsDao implements EventsDao {

    public List<Events> getAllEvents() {
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(" SELECT * FROM Events")
                    .executeAndFetch(Events.class);
        }
    }

    public void addEvents(Events events){
        String sql = "INSERT INTO Events(eventId, eventOrganiserId, price, eventName VALUES ( :eventId, : eventOrganisers, :price, :eventName, now())";
        try(Connection con = DB.sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(Events)
                    .executeUpdate()
                    .getKey();
            Events.setId(id);
        } catch (Sql2oException e){
            System.out.println("e");
        }


    }

    public Events findEventsById(int id) {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM Events WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Events.class);
        }

    }

    public void deleteEventsById(int id) {

        String sql = "DELETE FROM Events WHERE id = :id";
        try (Connection con = DB.sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    public void deleteAllEvents() {
        String sql = "DELETE FROM Events";
        try(Connection con = DB.sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();

        } catch (Sql2oException e){
            System.out.println("e");
        }


    }


}
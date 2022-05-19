package dao;

import models.EventsOrganisers;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oEventsOrganisersDao implements EventsOrganisersDao {

    public List<EventsOrganisers> getAllEventsOrganisers() {
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(" SELECT * FROM EventsOrganisers")
                    .executeAndFetch(EventsOrganisers.class);
        }
    }

    public void addEvents(EventsOrganisers eventsOrganisers){
        String sql = "INSERT INTO Events(eventId, eventOrganiserId, price, eventName VALUES ( :eventId, : eventOrganisers, :price, :eventName, now())";
        try(Connection con = DB.sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(EventsOrganisers)
                    .executeUpdate()
                    .getKey();
            EventsOrganisers.setId(id);
        } catch (Sql2oException e){
            System.out.println("e");
        }


    }

    public EventsOrganisers findEventsById(int id) {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM EventsOrganisers WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(EventsOrganisers.class);
        }

    }

    public void deleteEventsOrganisersById(int id) {

        String sql = "DELETE FROM EventsOrganisers WHERE id = :id";
        try (Connection con = DB.sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    public void deleteAllEventsOrganisers() {
        String sql = "DELETE FROM EventsOrganisers";
        try(Connection con = DB.sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();

        } catch (Sql2oException e){
            System.out.println("e");
        }


    }


}
package dao;

import models.Subscriber;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oSubscriberDao implements SubscriberDao {

    public List<Subscriber> getAllSubscriber() {
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(" SELECT * FROM Subscriber")
                    .executeAndFetch(Subscriber.class);
        }
    }

    public void addSubscriber(Subscriber subscriber){
        String sql = "INSERT INTO Subscriber(Name ,Email ,phoneNumber ,eventId ,subscriberId ,Quantity, Total  VALUES ( :Name, : Email, :phoneNumber, :eventId, :subscrberId, :Quantity, :Total now())";
        try(Connection con = DB.sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(Subscriber)
                    .executeUpdate()
                    .getKey();
            Subscriber.setId(id);
        } catch (Sql2oException e){
            System.out.println("e");
        }


    }

    public Subscriber findSubscriberById(int id) {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM Subscriber WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Subscriber.class);
        }

    }

    public void deleteSubscriberById(int id) {

        String sql = "DELETE FROM Subscriber WHERE id = :id";
        try (Connection con = DB.sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    public void deleteAllSubscriber() {
        String sql = "DELETE FROM Subscriber";
        try(Connection con = DB.sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();

        } catch (Sql2oException e){
            System.out.println("e");
        }


    }


}
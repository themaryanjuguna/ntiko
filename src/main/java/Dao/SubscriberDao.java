package dao;

import models.Subscriber;
import java.util.List;


public interface SubscriberDao {
    //CRUD
    List<Subscriber> getAllSubscriber();

    void addSubscriber(Subscriber subscriber);

    Subscriber findSubscriberById(int id);
    void deleteSubscriberById(int id);
    void deleteAllSubscriber();



}
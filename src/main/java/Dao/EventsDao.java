package dao;

import models.Events;
import java.util.List;


public interface EventsDao {
    //CRUD
    List<Events> getAllEvents();
    void addEvents(Events events);
    Events findEventsById(int id);
    void deleteEventsById(int id);
    void deleteAllEvents();



}
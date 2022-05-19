package dao;

import models.EventOrganisers;

import java.util.List;

public interface EventOrganisersDao {

    List<EventOrganisers> getAllEventOrganisers();

    void addEventOrganisers(EventOrganisers eventOrganisers);

    EventOrganisers findEventOrganisersById(int id);

    EventOrganisers findEventOrganisersByBadgeNumber(int badgeNumber);

    void deleteEventOrganisersById(int id);

    void deleteAllEventOrganisers();
}
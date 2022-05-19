# n-tiko
It is an Event ticket selling Application. Users are able to know the upcoming Entertainment events, subscribe to them, and buy their tickets. N-Tiko brings the youth together through live experiences near them. Discover events that match your passions, or create your own with N-Tiko Application today.

## User Stories



## Setup
* Go to the [n-tiko](https://github.com/themaryanjuguna/ntiko.git) repository on GitHub.
* Clone the project into your local device.
* On the terminal, navigate to the project directory and run `gradle compile`. Then navigate to the `main` directory in the build folder and run `java App`.

### DATABASE SET UP.
```
* Type in psql
* CREATE DATABASE ntiko;
* CREATE TABLE eventOrganiser(eventOrganiserId serial PRIMARY KEY,
Name int,( to be changed to string)
telephoneNumber varchar,
Email varchar);
* CREATE TABLE ticket (ticketId serial PRIMARY KEY, eventId int, Type varchar, Status varchar);
* CREATE TABLE events (eventId serial PRIMARY KEY, eventOrganiserId int, Price money, EventName varchar);
* CREATE TABLE contacts (contactUsId serial PRIMARY KEY, Name varchar, phoneNumber int, Email varchar, Message varchar);
* CREATE TABLE subscriber (Name varchar, Email varchar, phoneNumber int, eventid int, subscriberId serial PRIMARY KEY, Quantity int, Total money);
* 

```

## Dependencies
1. Java
2. Gradle
3. Maven

## Technology used
1. Java
2. spark framework
3. handlebars
4. HTML
5. CSS
6. Bootstrap

## Author Details
- Diana Kieru [LinkedIn Profile](https://www.linkedin.com/in/diana-kieru-a71770227/)
- Joan Kariuki
- Maryanne Njuguna [Linktree Profile](https://linktr.ee/themaryanjuguna)
- Shannon Bulimo

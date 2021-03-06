import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        //homepage
        Map<String, Object> model = new HashMap<>();
        get("/", (request, response)->{
           return new ModelAndView(new HashMap<>(),"index.hbs");
        }, new HandlebarsTemplateEngine());


        //Events Page
        get("/events", (request, response)->{
            return new ModelAndView(new HashMap<>(),"events.hbs");
        }, new HandlebarsTemplateEngine());

        //About us page
        get("/about", (request, response)->{
            return new ModelAndView(new HashMap<>(),"/about.hbs");
        }, new HandlebarsTemplateEngine());


       //Contact page
        get("/contactsUs", (request, response) ->{

            return new ModelAndView(model, "contactsUs.hbs");
        }, new HandlebarsTemplateEngine());


        //Eventnew page
        get("/event-layout", (request, response) ->{

            return new ModelAndView(model, "event-layout.hbs");
        }, new HandlebarsTemplateEngine());

        //Eventnew page
       get("/Submission", (request, response) ->{

            return new ModelAndView(model, "Submission.hbs");
        }, new HandlebarsTemplateEngine());

    }
}

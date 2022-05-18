import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        Map<String, Object> model = new HashMap<>();
        get("/", (request, response)->{
           return new ModelAndView(new HashMap<>(),"index.hbs");
        }, new HandlebarsTemplateEngine());




    }
}

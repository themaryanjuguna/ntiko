import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import static spark.Spark.get;



import static java.lang.reflect.Array.get;
import static spark.Spark.staticFileLocation;
import static spark.route.HttpMethod.get;


public class App {
    public static void main(String[] args) {

        get("/", (request, response)->{
           return new ModelAndView(new HashMap<>(),"index.hbs");
        }, new HandlebarsTemplateEngine());




    }
}

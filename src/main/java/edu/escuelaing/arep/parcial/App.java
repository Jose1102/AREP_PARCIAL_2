package edu.escuelaing.arep.parcial;

import static spark.Spark.*;
import org.json.simple.JSONObject;
import spark.Request;
import spark.Response;

public class App {

    //private static Calculator calculator = new Calculator();

    public static void main(String... args){
        port(getPort());

        get("/", (req, res) -> {

            return "Hellou";
        });


        get("/log", App::getLog);
        get("/sin", App::getSeno);
    }


    private static Object getLog(Request request, Response response) {
        Double value = Double.valueOf(request.queryParams("value"));
        Double rta = Calculator.log(value);
        JSONObject myObject = new JSONObject();
        myObject.put("operation", "log");
        myObject.put("input", value);
        myObject.put("output", Calculator.log(value));
        return myObject;
    }



    private static Object getSeno(Request request, Response response) {
        Double value = Double.valueOf(request.queryParams("value"));
        Double rta = Calculator.seno(value);
        JSONObject myObject = new JSONObject();
        myObject.put("operation", "sin");
        myObject.put("input", value);
        myObject.put("output", Calculator.seno(value));
        return myObject;
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}

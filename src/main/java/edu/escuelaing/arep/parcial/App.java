package edu.escuelaing.arep.parcial;

import static spark.Spark.*;
import org.json.simple.JSONObject;
import spark.Request;
import spark.Response;

/**
 * @author Jose Maria Castro Ortega
 * Clase principal del programa, se usa spark
 */
public class App {

    //private static Calculator calculator = new Calculator();

    /**
     * Método main que realiza el llamado get de spark para llamar las operaciones matemáticas
     * @param args
     */
    public static void main(String... args){
        port(getPort());

        get("/", (req, res) -> {

            return "Hellou";
        });


        get("/log", App::getLog);
        get("/sin", App::getSeno);
    }


    /**
     *
     * @param request
     * @param response
     * @return myObject que es de tipo Object, es el json con la operación matemática log
     */
    private static Object getLog(Request request, Response response) {
        Double value = Double.valueOf(request.queryParams("value"));
        Double rta = Calculator.log(value);
        JSONObject myObject = new JSONObject();
        myObject.put("operation", "log");
        myObject.put("input", value);
        myObject.put("output", Calculator.log(value));
        return myObject;
    }


    /**
     *
     * @param request
     * @param response
     * @return myObject que es de tipo Object, es el JSON con la operación matemática seno
     */
    private static Object getSeno(Request request, Response response) {
        Double value = Double.valueOf(request.queryParams("value"));
        Double rta = Calculator.seno(value);
        JSONObject myObject = new JSONObject();
        myObject.put("operation", "sin");
        myObject.put("input", value);
        myObject.put("output", Calculator.seno(value));
        return myObject;
    }

    /**
     *
     * @return 5000 que es el puerto 
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}

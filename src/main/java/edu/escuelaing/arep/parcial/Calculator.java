package edu.escuelaing.arep.parcial;

/**
 * @author Jose Maria Castro Ortega
 * Clase Calculator que tiene como proposito realizar operaciones matemáticas
 */
public class Calculator {

    /**
     * Constructor de la clase Calculator
     */
    public Calculator() {
    }


    /**
     * Metodo get seno
     * @param value
     * @return seno que es una operación matemática usando value
     */
    public static Double seno(Double value){
        Double seno =  Math.sin(value);
        return seno;
    }

    /**
     *
     * @param value
     * @return log que es de tipo Double, es el logaritmo base 10 del parametro value
     */
    public static Double log(Double value){
        Double log =  Math.log10(value);
        return log;
    }


}

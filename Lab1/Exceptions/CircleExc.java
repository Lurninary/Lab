package Exceptions;

public class CircleExc extends Exception {                    
    
    private double Value;

    public CircleExc(String message, double value){
     
        super(message);                                     
        Value=value;

    }

    public double getvalue() {

        return Value;

    }
    
}

package Exceptions;

 public class RectangleExc extends Exception {
    
    private double number;

    public RectangleExc(String message, double value){
     
        super(message);
        number=value;

    }

    public double getvalue() {

        return number;

    }
    
}


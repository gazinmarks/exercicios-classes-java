package entities;

public class CurrencyConverter {

    public static double dollarPrice;
    public static double dollarQuantity;
    public static final double IOF = 6;


    public static double dollarConversion(double dollarQuantity) {
        double result;
        result = dollarPrice * dollarQuantity;
        return (IOF / 100) * result + result;
    }
}

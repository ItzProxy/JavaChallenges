//Assignment 1 Question 6
//Calculates the peak min and evening min
import java.math.BigDecimal;
import java.math.RoundingMode;
import javafx.util.converter.BigDecimalStringConverter;

public class PhoneBill{
    public static void main(String[] args){
        double basePrice = 19.99;
        if(args.length < 2){ //checks if args has enough arguments supplied (needs 2, anymore are discarded)
            System.out.println("Not enough arguments supplied");
            System.exit(1); //exit
        }
        double peakMin = Double.parseDouble(args[0]); //parse the first arg as a double
        double evenMin = Double.parseDouble(args[1]); //parse the second arg as a double
        double monthPrice = basePrice; 

        //if peak minutes > 200 then use the formulat
        //(0.3*(x)-200) where x is peak minutes
        if(peakMin > 200){
            monthPrice+=(0.3*(peakMin - 200));
        }
        //if evening minutes > 500 then use the formula
        //(0.15*(x)-500) where x is evening minutes
        if(evenMin > 500){
            monthPrice+=(0.15*(evenMin - 500));
        }
        System.out.println("Monthly bill = $" + BigDecimal.valueOf(monthPrice)
        .setScale(2, RoundingMode.HALF_UP)
        .doubleValue()); //print and format so that it will round the decimal upto percision of 2
    }
}
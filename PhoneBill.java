import java.math.BigDecimal;
import java.math.RoundingMode;
import javafx.util.converter.BigDecimalStringConverter;

public class PhoneBill{
    public static void main(String[] args){
        double basePrice = 19.99;
        if(args.length < 2){
            System.out.println("Not enough arguments supplied");
            System.exit(1);
        }
        double peakMin = Double.parseDouble(args[0]);
        double evenMin = Double.parseDouble(args[1]);
        double monthPrice = basePrice;

        if(peakMin > 200){
            monthPrice+=(0.3*(peakMin - 200));
        }
        if(evenMin > 500){
            monthPrice+=(0.15*(evenMin - 500));
        }
        System.out.println("Monthly bill = $" + BigDecimal.valueOf(monthPrice)
        .setScale(2, RoundingMode.HALF_UP)
        .doubleValue());
    }
}
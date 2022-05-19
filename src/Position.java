import java.math.RoundingMode;
import java.text.DecimalFormat;
    public class Position  {

        public static void main(String[] args) {
            double g = -9.81; // Earth's gravity in m/s^2
            double xi = 0.0;
            double t = 10.0;
            double vi = 0.0;
            double finalPosition ;
            finalPosition= 0.5*g*t*t  + vi*t + xi;
            DecimalFormat df=new DecimalFormat("#.#");
            df.setRoundingMode(RoundingMode.CEILING);
            System.out.println("The object's position after " + t + " seconds is " +df.format(finalPosition) + " m.");
        }
    }
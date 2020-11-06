package logging;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Calculator {

    private Logger calculatorLogger = Logger.getLogger(Calculator.class);

    public Calculator() {
        PropertyConfigurator.configure("log.properties");
    }

    public double add(double a, double b) {
        String msgToLog = "Called method add with params" + a + " and " + b;
        calculatorLogger.log(Level.INFO ,msgToLog);
        return a+b;
    }

    public double sub(double a, double b) {
        String msgToLog = "Called method sub with params" + a + " and " + b;
        calculatorLogger.log(Level.INFO ,msgToLog);
        return a-b;
    }

}

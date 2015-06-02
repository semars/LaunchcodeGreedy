import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Greedy {

    public static void main(String[] varArgs) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Greedy obj = (Greedy) context.getBean("greedy");
        obj.start();
    }

    private void start() {
        // Gets type of currency: dollars or euros
        Scanner currencyInputScan = new Scanner(System.in);
        String currencyInput;
        do {
            System.out.println("Enter '$' or '€' to select currency:");
            currencyInput = currencyInputScan.next();
        } while (!currencyInput.matches("\\$") && !currencyInput.matches("€"));

        // Gets amount of change
        Scanner changeInputScan = new Scanner(System.in);
        Float changeInput;
        do {
            System.out.println("Enter amount of change:");
            changeInput = changeInputScan.nextFloat();
        } while (changeInput < 0);

        int changeOutput = Math.round(changeInput * 100);

        // Creates appropriate calculator
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        if (currencyInput.matches("\\$")) {
            USCoinCalculator calculator = (USCoinCalculator) context.getBean("USCoinCalculator");
            calculator.calculateChange(changeOutput);
        } else if (currencyInput.matches("€")) {
            EUCoinCalculator calculator = (EUCoinCalculator) context.getBean("EUCoinCalculator");
            calculator.calculateChange(changeOutput);
        }
    }
}

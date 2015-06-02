public class EUCoinCalculator implements CoinCalculator {

    public String calculateChange(int amountOfChange) {
        // initialize variables
        int change = amountOfChange;
        int oneCent = 0;
        int twoCent = 0;
        int fiveCent = 0;
        int tenCent = 0;
        int twentyCent = 0;
        int fiftyCent = 0;
        int oneEuro = 0;
        int twoEuro = 0;
        String outputMessage;

        // break down change into coin denominations
        while (change / 200 > 0)
        {
            twoEuro = change / 200;
            change = change % 200;
        }
        while (change / 100 > 0)
        {
            oneEuro = change / 100;
            change = change % 100;
        }
        while (change / 50 > 0)
        {
            fiftyCent = change / 50;
            change = change % 50;
        }
        while (change / 20 > 0)
        {
            twentyCent = change / 20;
            change = change % 20;
        }
        while (change / 10 > 0)
        {
            tenCent = change / 10;
            change = change % 10;
        }
        while (change / 5 > 0)
        {
            fiveCent = change / 5;
            change = change % 5;
        }
        while (change / 2 > 0)
        {
            twoCent = change / 2;
            change = change % 2;
        }
        while (change > 0)
        {
            oneCent = change;
            change = 0;
        }
        // add up coin totals and display to console
        int coins = twoEuro + oneEuro + fiftyCent + twentyCent + tenCent + fiveCent + twoCent + oneCent;
        outputMessage = String.format("%d 2€ + %d 1€ + %d .50€ + %d .20€ + %d .10€ + %d .05€ + %d .02€ + %d .01€ = %d coin(s)",
                        twoEuro, oneEuro, fiftyCent, twentyCent, tenCent, fiveCent, twoCent, oneCent, coins);
        System.out.println(outputMessage);
        return outputMessage;
    }
}

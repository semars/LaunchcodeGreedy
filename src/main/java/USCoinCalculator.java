public class USCoinCalculator implements CoinCalculator {

    public String calculateChange(int amountOfChange) {
        // initialize variables
        int change = amountOfChange;
        int pennies = 0;
        int nickels = 0;
        int dimes = 0;
        int quarters = 0;
        int dollars = 0;
        String outputMessage;

        // break down change into coin denominations
        while (change / 100 > 0)
        {
            dollars = change / 100;
            change = change % 100;
        }
        while (change / 25 > 0)
        {
            quarters = change / 25;
            change = change % 25;
        }
        while (change / 10 > 0)
        {
            dimes = change / 10;
            change = change % 10;
        }
        while (change / 5 > 0)
        {
            nickels = change / 5;
            change = change % 5;
        }
        while (change > 0)
        {
            pennies = change;
            change = 0;
        }
        // add up coin totals and display to console
        int coins = dollars + quarters + dimes + nickels + pennies;
        outputMessage = String.format("%d dollars + %d quarters + %d dimes + %d nickels + %d pennies = %d coin(s)",
                        dollars, quarters, dimes, nickels, pennies, coins);
        System.out.println(outputMessage);
        return outputMessage;
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class USCoinCalculatorTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        USCoinCalculator coinCalculator = new USCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(0);

        assertEquals("0 dollars + 0 quarters + 0 dimes + 0 nickels + 0 pennies = 0 coin(s)", coinMessage);
    }
    @Test
    public void oneCentShouldGiveYouOnePenny() {
        USCoinCalculator coinCalculator = new USCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(1);

        assertEquals("0 dollars + 0 quarters + 0 dimes + 0 nickels + 1 pennies = 1 coin(s)", coinMessage);
    }
    @Test
    public void fiveCentsShouldGiveYouOneDime() {
        USCoinCalculator coinCalculator = new USCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(5);

        assertEquals("0 dollars + 0 quarters + 0 dimes + 1 nickels + 0 pennies = 1 coin(s)", coinMessage);
    }
    @Test
    public void tenCentsShouldGiveYouOneDime() {
        USCoinCalculator coinCalculator = new USCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(10);

        assertEquals("0 dollars + 0 quarters + 1 dimes + 0 nickels + 0 pennies = 1 coin(s)", coinMessage);
    }
    @Test
    public void twentyfiveCentsShouldGiveYouOneQuarter() {
        USCoinCalculator coinCalculator = new USCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(25);

        assertEquals("0 dollars + 1 quarters + 0 dimes + 0 nickels + 0 pennies = 1 coin(s)", coinMessage);
    }
    @Test
    public void onehundredCentsShouldGiveYouOneDollar() {
        USCoinCalculator coinCalculator = new USCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(100);

        assertEquals("1 dollars + 0 quarters + 0 dimes + 0 nickels + 0 pennies = 1 coin(s)", coinMessage);
    }
    @Test
    public void onehundredfortyoneCentsShouldGiveYouOneOfEach() {
        USCoinCalculator coinCalculator = new USCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(141);

        assertEquals("1 dollars + 1 quarters + 1 dimes + 1 nickels + 1 pennies = 5 coin(s)", coinMessage);
    }
}

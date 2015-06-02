import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EUCoinCalculatorTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(0);

        assertEquals("0 2€ + 0 1€ + 0 .50€ + 0 .20€ + 0 .10€ + 0 .05€ + 0 .02€ + 0 .01€ = 0 coin(s)", coinMessage);
    }
    @Test
    public void oneCentShouldGiveYouOneCent() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(1);

        assertEquals("0 2€ + 0 1€ + 0 .50€ + 0 .20€ + 0 .10€ + 0 .05€ + 0 .02€ + 1 .01€ = 1 coin(s)", coinMessage);
    }
    @Test
    public void twoCentsShouldGiveYouOneCent() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(2);

        assertEquals("0 2€ + 0 1€ + 0 .50€ + 0 .20€ + 0 .10€ + 0 .05€ + 1 .02€ + 0 .01€ = 1 coin(s)", coinMessage);
    }
    @Test
    public void fiveCentsShouldGiveYouOneFiveCent() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(5);

        assertEquals("0 2€ + 0 1€ + 0 .50€ + 0 .20€ + 0 .10€ + 1 .05€ + 0 .02€ + 0 .01€ = 1 coin(s)", coinMessage);
    }
    @Test
    public void tenCentsShouldGiveYouOneTenCent() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(10);

        assertEquals("0 2€ + 0 1€ + 0 .50€ + 0 .20€ + 1 .10€ + 0 .05€ + 0 .02€ + 0 .01€ = 1 coin(s)", coinMessage);
    }
    @Test
    public void twentyCentsShouldGiveYouOneTwentyCent() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(20);

        assertEquals("0 2€ + 0 1€ + 0 .50€ + 1 .20€ + 0 .10€ + 0 .05€ + 0 .02€ + 0 .01€ = 1 coin(s)", coinMessage);
    }
    @Test
    public void fiftyCentsShouldGiveYouOneFiftyCent() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(50);

        assertEquals("0 2€ + 0 1€ + 1 .50€ + 0 .20€ + 0 .10€ + 0 .05€ + 0 .02€ + 0 .01€ = 1 coin(s)", coinMessage);
    }
    @Test
    public void onehundredCentsShouldGiveYouOne1Euro() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(100);

        assertEquals("0 2€ + 1 1€ + 0 .50€ + 0 .20€ + 0 .10€ + 0 .05€ + 0 .02€ + 0 .01€ = 1 coin(s)", coinMessage);
    }
    @Test
    public void twohundredCentsShouldGiveYouOne2Euro() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(200);

        assertEquals("1 2€ + 0 1€ + 0 .50€ + 0 .20€ + 0 .10€ + 0 .05€ + 0 .02€ + 0 .01€ = 1 coin(s)", coinMessage);
    }
    @Test
    public void threehundredeightyeightCentsShouldGiveYouOneOfEach() {
        EUCoinCalculator coinCalculator = new EUCoinCalculator();

        String coinMessage = coinCalculator.calculateChange(388);

        assertEquals("1 2€ + 1 1€ + 1 .50€ + 1 .20€ + 1 .10€ + 1 .05€ + 1 .02€ + 1 .01€ = 8 coin(s)", coinMessage);
    }
}

import java.util.Random;

/**
 * Generate value that follow the normal distribution with a mean and a variance
 */
public class Gaussian {
    private final double mean;
    private final double var;
    private final Random rnd;

    public Gaussian(double mean, double var, Random rnd) {
        if (var < 0.0)
            throw new IllegalArgumentException("Variance can not be negative number");
        this.mean = mean;
        this.var = var;
        this.rnd = (rnd == null)? new Random(): rnd;
    }

    /**
     * generate random number, based on a mean and variance
     * @return Double
     */
    public double random() {
        double randDouble = 0.0;
        while (randDouble == 0.0)
            randDouble = rnd.nextDouble();
        double n = Math.sqrt( -2.0 * Math.log(randDouble));
        if (rnd.nextDouble() < 0.5)
            return n * Math.sin(2.0 * Math.PI * rnd.nextDouble()) * var + mean;
        return n * Math.cos(2.0 * Math.PI * rnd.nextDouble()) * var + mean;
    }
}

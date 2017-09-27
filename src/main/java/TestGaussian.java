import java.util.Random;

public class TestGaussian {
    public static void main(String[] args) {
        //generate values around -2.0, with variance 1.0
        Gaussian gaussian1 = new Gaussian(-2.0, 1.0, null);
        //generate values around [
        Gaussian gaussian2 = new Gaussian(2.0, 1.0, new Random());
        System.out.println("values around -2.0\t\t values around 2.0");
        for (int i = 0; i < 5; i++)
            System.out.println(gaussian1.random() + "\t\t" + gaussian2.random());
    }
}

package Utils;

public final class ActivationFunction {
    public static int step(double value) {
        //return the class number
        return (value >= 0)? 1: -1;
    }
}

import java.util.function.Supplier;

public class SuplierDemo {

    static void main(String[] args) {

        Supplier<Double> randomNumber = Math::random;

        System.out.println(randomNumber.get());
    }
}

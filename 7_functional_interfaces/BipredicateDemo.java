import java.util.function.BiPredicate;

public class BipredicateDemo {

    static void main(String[] args) {

        int i = 10;
        int j = 2;
        int threshold = 8;

        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
        BiPredicate<Integer, Integer> isGreaterThanThreshold = (a, b) -> (a > threshold && b > threshold);
        BiPredicate<Integer, Integer> isEvenAndGreaterThan5 = isSumEven.and(isGreaterThanThreshold);

        boolean result = isEvenAndGreaterThan5.test(10, 10);

        System.out.println("The sum of " + i + " and " + j + " is even number and greater then 5 ? -> " + result);
    }

}

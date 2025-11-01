import java.security.Security;
import java.util.function.Predicate;

public class PredicateDemo {

    static void main(String[] args) {
        int a = 4;
        int b = 5;

        Predicate<Integer> isEvenPredicate = i -> i % 2 == 0;
        Predicate<Integer> greaterThanFive = n -> n > 5;

        System.out.println("Is " + a + " even ? :" + isEvenPredicate.test(a));
        System.out.println("Is " + b + " even ? :" + isEvenPredicate.test(b));

        /**
         * Predicate have several methods
         * and - represents logical AND
         * or - represents logical OR
         * negate - represents !
         */
        Predicate<Integer> isEvenAndGreaterThanFIve = isEvenPredicate.and(greaterThanFive);
        System.out.println(isEvenAndGreaterThanFIve.test(6));


        Predicate<Integer> isEvenOrGreaterThanFIve = isEvenPredicate.or(greaterThanFive);
        System.out.println(isEvenOrGreaterThanFIve.test(2));


        Predicate<Integer> isOdd= isEvenPredicate.negate();
        System.out.println(isOdd.test(4));

    }
}

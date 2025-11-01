import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer> addition = Integer::sum;
    public static BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> (a - b);
    public static BiFunction<String, String, String> concatenation = String::concat;

    static void main(String[] args) {

        int result1 = addition.apply(20, 24);
        System.out.println(result1);

        String result2 = concatenation.apply("Kevin", "Njogu");
        System.out.println(result2);

        int result3  = subtraction.apply(10, 3);
        System.out.println(result3);
    }
}

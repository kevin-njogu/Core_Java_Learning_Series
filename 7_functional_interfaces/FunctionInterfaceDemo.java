import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static Integer add(int a) {
        return a + 5;
    }

    public static Integer subtract(int a) {
        return a - 5;
    }


    public static Function<Integer, Integer> addFunction = (a) -> (a + 5);
    public static Function<Integer, Integer> subtractFunction = (a) -> (a - 5);
    public static Function<Integer, Integer> combinedFunction = addFunction.andThen(subtractFunction);

    static void main(String[] args) {
        int result = add(10);
        int result1 = subtract(10);
        System.out.println("Add result without function interface: " + result);
        System.out.println("Subtract result without function interface: " + result1);


        int result3 = addFunction.apply(10);
        int result4 = subtractFunction.apply(10);
        System.out.println("Add result with function interface: " + result3);
        System.out.println("Subtract result with function interface: " + result4);

        int result5 = combinedFunction.apply(13);
        System.out.println("Combined function output is: " + result5);

    }
}

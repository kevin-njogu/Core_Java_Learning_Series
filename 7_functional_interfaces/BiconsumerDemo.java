import java.util.function.BiConsumer;

public class BiconsumerDemo {

    static void main(String[] args) {
        BiConsumer<Integer, Integer> add = (a, b) -> System.out.println("Addition " + (a + b));
        BiConsumer<Integer, Integer> subtract = (a, b) -> System.out.println("Subtraction " + (a - b));
        BiConsumer<Integer, Integer> chained = add.andThen(subtract);

        add.accept(3, 7);
        subtract.accept(3, 2);
        chained.accept(10, 5);
    }
}

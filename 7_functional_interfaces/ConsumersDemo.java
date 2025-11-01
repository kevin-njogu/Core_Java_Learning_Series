import java.util.function.Consumer;

public class ConsumersDemo {

    static void main(String[] args) {

        Consumer<String> messagePrinter = System.out::println;
        Consumer<String> messageLengthPrinter = str -> System.out.println(str.length());
        Consumer<String> combinedConsumer = messagePrinter.andThen(messageLengthPrinter);

        messagePrinter.accept("Hi I a the printed message");
        messageLengthPrinter.accept("My length is ?");
        combinedConsumer.accept("Print me and my length");//Prints the message and then the Length
    }
}

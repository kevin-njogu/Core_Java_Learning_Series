import java.util.function.Consumer;

interface SayHello {
    void sayHi();
}


interface Operation {
    int add(int a, int b);
}


public class LambaFunctions {

    static void main() {

        //First Implementation
        SayHello sayHello = new SayHello() {
            @Override
            public void sayHi() {
                System.out.println("Hi from Java");
            }
        };

        //First refinement
        SayHello lambdaHello = () -> {
            System.out.println("Hi from lambda Java");
        };

        //Final refinement
        SayHello lambdaRefined = () -> System.out.println("Hello from refined Lambda");


        //First Implementation
        Operation operation = new Operation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        //First refinement
        Operation operation1 = (int a, int b) -> {
            return a + b;
        };

        //Second refinement
        Operation operation2 = (int a, int b) -> (a + b);

        //Parameterized Lambdas
        Operation operation3 = (a, b) -> (a + b);

        System.out.println(operation3.add(10, 30));
    }
}

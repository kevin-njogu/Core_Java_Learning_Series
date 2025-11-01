
/**
 * Functional interfaces are Java interfaces with only one abstract method and a @FunctionalInterface annotation
 */

@java.lang.FunctionalInterface
interface OwnFunctionalInterface {
    void ownInterface();
}


@java.lang.FunctionalInterface
interface InheritedInterface extends OwnFunctionalInterface {
    void ownInterface();
}


class Test implements OwnFunctionalInterface {
    @Override
    public void ownInterface() {

    }
}


public class FunctionalInterface {

    static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
    }
}

import java.lang.FunctionalInterface;
import java.util.Locale;

@FunctionalInterface
interface StringOps {
    String operate(String input);
}

public class MethodReferences {

    static void main(String[] args) {
        //:: - syntax for method reference

        StringOps stringOps = str -> str.toUpperCase();
        StringOps stringOps1 = String::toLowerCase;

        System.out.println(stringOps.operate("uppercase"));
        System.out.println(stringOps1.operate("LOWERCASE"));
    }
}

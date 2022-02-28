import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment8Q3 {
    public static void main(String[] args) {

        Consumer<Integer>consumer=(a)-> System.out.println("Hi your number is "+ a);
        consumer.accept(48);


        Consumer<String>consumer1=(b)-> System.out.println("Hi my name is "+ b);
        consumer1.accept("Balaji S S");

        Supplier<Integer>supplier=()-> 10;
        System.out.println(supplier.get());

        Predicate<Integer>predicate=(a)->a*1==5;
        System.out.println(predicate.test(7));

    }
}
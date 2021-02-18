package early;

public class EarlyTest {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Duck rubberduck = new RubberDuck();

        duck.quack();
        rubberduck.quack(); //early binding - compile time
    }
}
package late;

public class LateTest {
    public static void main(String[] args){
        Duck duck = new Duck();
        Duck rubberduck = new RubberDuck();

        duck.quack();
        rubberduck.quack(); //late binding - runtime
    }
}

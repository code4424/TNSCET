@FunctionalInterface
interface Sayable {
    String say(String message);
}

public class LambdaExample {
    public static void main(String[] args) {
        Sayable sayable = (message) -> "Hello, " + message;

        System.out.println(sayable.say("World!"));
    }
}

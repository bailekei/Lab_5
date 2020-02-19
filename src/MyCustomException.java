public class MyCustomException extends Exception {

    static int numberOfExceptions;

    public static int getNumberOfExceptions() {
        return numberOfExceptions;
    }
}

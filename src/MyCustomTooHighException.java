public class MyCustomTooHighException extends MyCustomException {

    public MyCustomTooHighException(int numberOfExceptions){
        super.numberOfExceptions++;
    }
}

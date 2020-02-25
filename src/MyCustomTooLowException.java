public class MyCustomTooLowException extends MyCustomException {

    public MyCustomTooLowException(int numberOfExceptions){
        super.numberOfExceptions++;
    }

}

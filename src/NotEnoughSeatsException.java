public class NotEnoughSeatsException extends RuntimeException{
    protected String msg;

    public NotEnoughSeatsException(String message){
        super(message);
        this.msg = message;
    }

    public String getMsg() {
        return msg;
    }
}
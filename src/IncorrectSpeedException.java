public class IncorrectSpeedException extends Exception{
    protected String msg;

    public IncorrectSpeedException (String message){
        super(message);
        this.msg = message;
    }

    public String getMsg() {
        return msg;
    }
}

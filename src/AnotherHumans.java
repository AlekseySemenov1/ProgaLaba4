import java.util.Objects;

public class AnotherHumans extends Human implements Mourners, Greeters{
    protected String status;

    public AnotherHumans(String name){
        this.name = name;
    }

    @Override
    public String seeoff(Station.Platform a) {
        location = a.getName();
        status = "провожают отъезжающих";
        return status;
    }


    @Override
    public String tomeetpassegers() {
        location = "вокзал";
        status = "встречают приезжающих";
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AnotherHumans that = (AnotherHumans) o;
        return Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status);
    }

    @Override
    public String toString() {
        return "AnotherHumans{" +
                "status='" + status + '\'' +
                "} " + super.toString();
    }
}

import java.util.Objects;

public class Passengers extends Human{
    protected String quantity;
    protected String items;
    protected String status;

    public Passengers (String name){
        this.name = name;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public String totake(Items a, Items b){
        this.items = a.getName() + " и " + b.getName();
        return "взяли " + this.items;
    }

    public void moveto(Traincarriage traincarriage, Traincarriage.Doors doors) {
        this.location = traincarriage.getName();
        this.status = " приближаются к объекту " + doors.getName();
    }

    @Override
    public String getLocation() {
        return "идут по локации \"" + location + "\"";
    }

    public String getStatus() {
        return status;
    }

    public void entrance(City a, Station b){
        this.location = b.getName() + " города " + a.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passengers that = (Passengers) o;
        return Objects.equals(quantity, that.quantity) && Objects.equals(items, that.items) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity, items, status);
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "quantity='" + quantity + '\'' +
                ", items='" + items + '\'' +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }
}

import java.util.Objects;

public class Kozlik extends Human{
    protected String information;
    public Kozlik (String name){
        this.name = name;
    }

    public String lookaround(Julio jul){
        if (this.location == jul.getLocation())
            this.information = jul.getName() + " находится в локации " + jul.getLocation();
        else
            this.information = jul.getName() + " здесь тоже не было.";
        return " оглянулся: " + this.information;
    }

    public String getInformation() {
        return information;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kozlik kozlik = (Kozlik) o;
        return Objects.equals(information, kozlik.information);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), information);
    }

    @Override
    public String toString() {
        return "Kozlik{" +
                "information='" + information + '\'' +
                "} " + super.toString();
    }
}

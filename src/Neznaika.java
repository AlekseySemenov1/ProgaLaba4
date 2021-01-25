import java.util.Objects;

public class Neznaika extends Human {
    protected String information;

    public Neznaika (String name){
        this.name = name;
    }

    public String lookaround(Migu mi){
        if (this.location == mi.getLocation())
            this.information = mi.getName() + " находится в локации " + mi.getLocation();
        else
            this.information = mi.getName() + " здесь нет.";
        return " осмотрелся и понял " + this.information;
    }

    public String getInformation() {
        return information;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Neznaika neznaika = (Neznaika) o;
        return Objects.equals(information, neznaika.information);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), information);
    }

    @Override
    public String toString() {
        return "Neznaika{" +
                "information='" + information + '\'' +
                "} " + super.toString();
    }
}

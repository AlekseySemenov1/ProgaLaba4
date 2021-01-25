import java.util.Objects;

public class City extends Places{
    protected String value;

    public City(String name) {
        super(name);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(value, city.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "City{" +
                "value='" + value + '\'' +
                "} " + super.toString();
    }
}

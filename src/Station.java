import java.util.Objects;

public class Station extends Places{
    protected String name;

    public Station(String name) {
        super(name);
    }

    static class Platform{
        protected String name = "перрон";
        protected final int capacity = 200;
        protected int quantitypeople;

        public String getName() {
            return name;
        }

        public void setQuantitypeople(int quantitypeople) throws NotEnoughSeatsException{
            if (quantitypeople <= capacity)
                this.quantitypeople = quantitypeople;
            else
                throw new NotEnoughSeatsException("Слишком много людей на перроне");
        }

        public String getQuantitypeople() {
            if (quantitypeople == 0)
                return " Перрон опустел. ";
            else
                return "на перроне " + quantitypeople + " человек. ";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return Objects.equals(name, station.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}



import java.util.Objects;

public class Traincarriage {
    protected String name;

    public Traincarriage (String name) {
        this.name = name;
    }
    public class Shelf {
        protected String name = "полки ";

        public String getName() {
            return name;
        }
    }

    public class Doors {
        protected String name = "вагонные двери";

        public String getName() {
            return name;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Traincarriage that = (Traincarriage) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Traincarriage{" +
                "name='" + name + '\'' +
                '}';
    }
}

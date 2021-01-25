import java.util.Objects;

public class Train {
    protected String location;
    protected String name;
    protected int speed;

    public Train(String name){
        this.name = name;
    }

    public String moveto(Station A) {
        this.location = A.getName();
        return name + " приближается к локации " + location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setspeed(int a) {
        if (a>=0 && a<200)
            this.speed = a;
        else
            try {
                throw new IncorrectSpeedException("Введено некорректное значение скорости");
            } catch (IncorrectSpeedException exception) {
                System.out.println(exception.getMsg());
            }
    }

    public String getSpeed() {
        if (speed == 0)
            return name + " остановился";
        else return name + " разгоняется";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return speed == train.speed && Objects.equals(location, train.location) && Objects.equals(name, train.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, name, speed);
    }

    @Override
    public String toString() {
        return "Train{" +
                "location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}

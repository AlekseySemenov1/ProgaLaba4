public class Main {
    public static void main(String[] args) {
        Train train = new Train("Поезд");
        train.setspeed(-10);
        Traincarriage trcar = new Traincarriage("вагон №1 ");
        Traincarriage.Shelf shelf = trcar.new Shelf();
        Traincarriage.Doors doors = trcar.new Doors();
        Station stat = new Station("станция");
        Station.Platform plat = new Station.Platform();

        try {
            plat.setQuantitypeople(300);
        } catch (NotEnoughSeatsException exc) {
            System.out.println(exc.getMsg());
            plat.setQuantitypeople(200);
        }

        System.out.print(train.moveto(stat) + ". ");

        Passengers pass = new Passengers("пассажиры ");
        pass.setQuantity("Многие ");
        pass.moveto(trcar, doors);
        Items bag = Items.Bag;
        Items suitcase = Items.Suitcase;
        System.out.println(pass.getQuantity() + pass.getName() + pass.totake(bag, suitcase) + ", " + pass.getLocation() + "," + pass.getStatus() + ".");

        Kozlik koz = new Kozlik("Козлик");
        Neznaika nez = new Neznaika("Незнайка");
        System.out.print(nez.getName() + " и " + koz.getName() + " встали с " + shelf.getName() + "и идут к выходу. ");

        City sankom = new City("Сан-Комарик");
        sankom.setValue("большой");
        train.setspeed(0);
        System.out.println(sankom.getName() + " был очень " + sankom.getValue() + ", многие " + pass.getName() + "выходили здесь. " + train.getSpeed() + ". ");

        pass.entrance(sankom, stat);
        AnotherHumans taxi = new AnotherHumans("Таксисты ");
        AnotherHumans friends = new AnotherHumans("Родственники и друзья ");
        System.out.print(pass.getName() + pass.getLocation() + ". " + friends.getName() + friends.seeoff(plat) + ". ");
        System.out.println(taxi.getName() + taxi.tomeetpassegers() + " на " + taxi.getLocation() + "е.");

        nez.setLocation(plat.getName());
        koz.setLocation(plat.getName());
        Migu migu = new Migu("Мигу", "Сан-Комарик");
        Julio julio = new Julio("Жулио", "Сан-комарик");
        System.out.println(nez.getName() + " и " + koz.getName() + " вышли из вагона на перрон. " + nez.getName() + nez.lookaround(migu));

        plat.setQuantitypeople(0);
        System.out.println(koz.getName() + koz.lookaround(julio) + plat.getQuantitypeople() + "Остались только " + nez.getName() + " и "+ koz.getName() + ".");
    }
}

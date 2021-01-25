public enum Items {
    Bag("сумки"),
    Suitcase("чемоданы");

    protected String name;

    Items(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

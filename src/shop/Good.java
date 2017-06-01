package shop;

public class Good {
    private String name;
    private int cost;

    Good(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}

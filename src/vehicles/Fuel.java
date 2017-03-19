package vehicles;

public class Fuel { // Просто класс, реализующий топливо он не должен зависить от Vehicle
    private int price;
    private String name;

    public Fuel(String name, int price) {
        setName(name);
        setPrice(price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) this.price = price;
        else this.price = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) this.name = name;
        else this.name = "FUEL";
    }
}

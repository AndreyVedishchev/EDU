package shop;

public class Main {
    public static void main(String[] args) {
        Shop sh = new Shop("Pharmacy", "Pushkina 5");
        sh.arrivalGoods("Analgin", 10.5);
        sh.printProduct();
    }
}

package shop;

public class ShopIsFull extends Exception {
    @Override
    public String toString() {
        return "Пополнение ассортимента не требуется";
    }
}

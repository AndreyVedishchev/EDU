package shop;

public class ObjectIsMissing extends Exception{
    @Override
    public String toString() {
        return "Этого товара нет в наличии";
    }
}
